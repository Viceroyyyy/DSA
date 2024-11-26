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

public class IntroToDLL {
    Node constructDLL(int arr[]) {
        Node head = null;
        Node tail = null;

        for (int i = 0; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        return head;
    }

    // Method to display the DLL from head to tail
    void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to display the DLL from tail to head
    void printReverseDLL(Node head) {
        if (head == null) return;

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        while (tail != null) {
            System.out.print(tail.data + " ");
            tail = tail.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        IntroToDLL dll = new IntroToDLL();
        int[] arr = {1, 2, 3, 4, 5};

        // Construct DLL
        Node head = dll.constructDLL(arr);

        // Print DLL
        System.out.print("DLL (Head to Tail): ");
        dll.printDLL(head);

        // Print DLL in reverse
        System.out.print("DLL (Tail to Head): ");
        dll.printReverseDLL(head);
    }
}