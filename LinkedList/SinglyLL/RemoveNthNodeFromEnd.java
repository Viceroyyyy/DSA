class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n==1){
            if(head.next==null)
            return null;
            else if(head.next.next==null){
                head.next = null;
                return head;
            }
        }

        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        
        int m = count - n;
        
        if(m+1<=count){
            temp = head;
        int newCount = 1;
        while(newCount<m){
            temp = temp.next;
            newCount++;
        }
        if(temp==head && newCount>m)
            {head = head.next;
            return head;
            }
        else if(temp.next.next!=null)
        temp.next = temp.next.next;
        else
        {   
            temp.next = null;}
        }
        

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

        RemoveNthNodeFromEnd solution = new RemoveNthNodeFromEnd();
        head = solution.removeNthFromEnd(head, 2); // Remove the 2nd node from the end

        System.out.println("After removing 2nd node from the end:");
        printList(head);
    }
}
