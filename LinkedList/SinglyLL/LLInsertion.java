class Node {
    int data;
    Node next;

    // Constructor to create a new node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LLInsertion {
    Node insertAtEnd(Node head, int x) {
        
        Node newNode = new Node(x);
        
        if(head==null){
           head = newNode; 
        }else{
            Node currNode = head;
        
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        
        currNode.next = newNode;
        }
        
        return head;
    }

    public static void main(String[] args) {
        LLInsertion ll = new LLInsertion();
        Node head = null; // Start with an empty linked list

        // Insert elements at the end of the linked list
        head = ll.insertAtEnd(head, 10);
        head = ll.insertAtEnd(head, 20);
        head = ll.insertAtEnd(head, 30);
        head = ll.insertAtEnd(head, 40);

        // Print the linked list
        System.out.println("Linked list after insertions:");
        printLinkedList(head);
    }

    // Method to print the linked list
    static void printLinkedList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
