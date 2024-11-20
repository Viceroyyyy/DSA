
class Node {
    int data;
    Node next;

    // Constructor to create a new node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class ArrayToLinkedList {
    
    static Node constructLL(int arr[]) {
        // code here
        Node head;
        head = null;
        Node tail = null;
        
        for(int i = 0;i<arr.length;i++){
            Node newNode = new Node(arr[i]);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
            
            tail.next = newNode;
            tail=newNode;
            }
            
        }
        
        return head;
    }

    static void printLinkedList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // Example array
        int[] arr = {10, 20, 30, 40, 50};

        // Convert array to linked list
        Node head = constructLL(arr);

        // Print the linked list
        System.out.println("Linked list constructed from array:");
        printLinkedList(head);
    }
}
