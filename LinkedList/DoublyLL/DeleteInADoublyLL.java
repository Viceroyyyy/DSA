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

public class DeleteInADoublyLL {
    public Node deleteNode(Node head, int k) {
        if(head==null) return null;

        if(k==1){
            if(head==null)
            return null;
            else 
            {
                head = head.next;
                head.prev = null;
                return head;
            }
        }else{
            Node temp = head;
            int count = 1;
            while(count<k-1 && temp.next.next!=null){
                temp = temp.next;
                count++;
            }
            if(count!=k-1)
            return head;
            else
            {
                if(temp.next.next!=null)
                temp.next.next.prev = temp;

                temp.next = temp.next.next;
            }  
        }
        return head;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;

        System.out.println("Original List:");
        printList(head);

        DeleteInADoublyLL dll = new DeleteInADoublyLL();
        head = dll.deleteNode(head, 2); // Delete the 2nd node

        System.out.println("After Deleting 2nd Node:");
        printList(head);

        head = dll.deleteNode(head, 1); // Delete the head node

        System.out.println("After Deleting Head Node:");
        printList(head);

        head = dll.deleteNode(head, 5); // Attempt to delete a non-existent node

        System.out.println("After Attempting to Delete 5th Node:");
        printList(head);
    }
}
