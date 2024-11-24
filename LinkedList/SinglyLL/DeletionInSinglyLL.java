class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class DeletionInSinglyLL {
    Node deleteNode(Node head, int x) {
        // code here
        
        if(head==null)
        return head;
        
        if(head.next==null)
        {head = head.next;
        return head;}
        
        if(x==1){
            head = head.next;
            return head;
        }else{
            int count=1;
            Node temp = head;
            while(count<x-1 &&  temp.next.next!=null){
                temp = temp.next;
                count++;
            }
            
            if(temp.next.next==null)
            temp.next = null;
            else{
                temp.next = temp.next.next;
            }
        }
        
        return head;
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
        DeletionInSinglyLL obj = new DeletionInSinglyLL();

        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        // Delete node at position 3
        head = obj.deleteNode(head, 3);

        System.out.println("After deleting node at position 3:");
        printList(head);

        // Delete node at position 1 (head)
        head = obj.deleteNode(head, 1);

        System.out.println("After deleting node at position 1:");
        printList(head);

        // Try deleting node at position 10 (out of range)
        head = obj.deleteNode(head, 10);

        System.out.println("After trying to delete node at position 10 (out of range):");
        printList(head);
    }
}
