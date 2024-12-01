class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
       ListNode odd = head;
       ListNode even = head.next;
       ListNode evenHead = even;

       while(even!=null && even.next!=null){
        odd.next = even.next;
        odd= odd.next;

        even.next = odd.next;

        even = even.next;
        
       }

       odd.next =evenHead;

       return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create the linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        printList(head);

        OddEvenLinkedList solution = new OddEvenLinkedList();
        head = solution.oddEvenList(head);

        System.out.println("After rearranging odd and even indexed nodes:");
        printList(head);
    }
}
