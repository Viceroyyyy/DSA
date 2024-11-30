public class PalindromLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public boolean isPalindrome(ListNode head) {
        // Stack<Integer> st = new Stack<>();

        // ListNode temp = head;

        // while(temp!=null){
        //     st.push(temp.val);
        //     temp = temp.next;

        // }

        // temp = head;

        // while(temp!=null){
        //     if(temp.val!=st.peek())
        //     return false;

        //     st.pop();
        //     temp = temp.next;
        // }

        // return true;

    ListNode slow = head;
    ListNode fast = head;

    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
    }

    ListNode temp = slow;
    ListNode last = null;
    
        while(temp!=null){
            ListNode forward = temp.next;
            temp.next = last;
            last = temp;
            temp = forward;
        }

        temp = head;
        while(temp!=slow){
            if(temp.val!=last.val)
            return false;

            temp = temp.next;
            last = last.next;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromLinkedList pll = new PalindromLinkedList();

        // Test case 1: Palindrome linked list: 1 -> 2 -> 2 -> 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(1);

        System.out.println(pll.isPalindrome(head1)); // Output: true

        // Test case 2: Non-palindrome linked list: 1 -> 2 -> 3
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);

        System.out.println(pll.isPalindrome(head2)); // Output: false

        // Test case 3: Single node list: 1
        ListNode head3 = new ListNode(1);

        System.out.println(pll.isPalindrome(head3)); // Output: true

        // Test case 4: Empty list
        System.out.println(pll.isPalindrome(null)); // Output: true
    }
}
