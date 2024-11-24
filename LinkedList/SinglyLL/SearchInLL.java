class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SearchInLL {
    static boolean searchKey(int n, Node head, int key) {
        Node currNode = head;
        
        while(currNode.next!=null){
            if(currNode.data==key)
            return true;
            currNode = currNode.next;
        }
        
        if(currNode.data==key)
        return true;
        
        return false;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Linked List:");
        printList(head);

        // Search for a key in the linked list
        int key = 3;
        if (searchKey(4, head, key)) {
            System.out.println("Key " + key + " is present in the linked list.");
        } else {
            System.out.println("Key " + key + " is not present in the linked list.");
        }

        // Search for a key not in the list
        key = 5;
        if (searchKey(4, head, key)) {
            System.out.println("Key " + key + " is present in the linked list.");
        } else {
            System.out.println("Key " + key + " is not present in the linked list.");
        }
    }
}
