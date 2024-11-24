class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class ReverseLL {

    public static ListNode ReverseList(ListNode last,ListNode temp,ListNode head){
        if(temp.next==null)
        {temp.next = last;
        head = temp;
        return head;}

        head = ReverseList(temp,temp.next,head);
         temp.next = last;
         return head;
    }

    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode last = null;
        //Recursive Method to reverse a singly Linked List
    if(head == null) return head;
       return  ReverseList(last,temp,head);

        
    }
    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ReverseLinkedList obj = new ReverseLinkedList();
    
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
    
        System.out.println("Original list:");
        obj.printList(head);
    
        // Reverse the linked list
        head = obj.reverseList(head);
    
        System.out.println("Reversed list:");
        obj.printList(head);
    }
}
