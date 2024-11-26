class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DLLInsertionAtGivenPos{
    Node addNode(Node head, int p, int x) {
        Node newNode = new Node(x);

        // Insert at the head position
        if (p == 0) {
            if (head == null) return newNode; // If the list is empty, newNode becomes head

            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return head;
        }

        // Traverse to the position before 'p'
        Node temp = head;
        int count = 0;

        while (count < p - 1 && temp.next != null) {
            temp = temp.next;
            count++;
        }

        // Insert at the end if 'p' exceeds the list size
        if (temp.next == null && count < p - 1) {
            temp.next = newNode;
            newNode.prev = temp;
            return head;
        }

        // General insertion
        newNode.next = temp.next;
        if (temp.next != null) temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    // Method to print the DLL
    void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLLInsertionAtGivenPos dll = new DLLInsertionAtGivenPos();

        // Create initial DLL
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        System.out.print("Original DLL: ");
        dll.printDLL(head);

        // Insert at position 0
        head = dll.addNode(head, 0, 0);
        System.out.print("After inserting 0 at position 0: ");
        dll.printDLL(head);

        // Insert at position 2
        head = dll.addNode(head, 2, 5);
        System.out.print("After inserting 5 at position 2: ");
        dll.printDLL(head);

        // Insert at position 5 (end of the list)
        head = dll.addNode(head, 5, 10);
        System.out.print("After inserting 10 at position 5: ");
        dll.printDLL(head);

        // Insert at position 10 (exceeding list size)
        head = dll.addNode(head, 10, 20);
        System.out.print("After inserting 20 at position 10: ");
        dll.printDLL(head);
    }
}