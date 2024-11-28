class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        // ListNode temp = head;
        // int count = 1;

        // while(temp.next!=null){
        //     temp = temp.next;
        //     count++;
        // }

        // count /= 2;
        // temp = head;
        // int i=1;
        // while(i!=count+1){
        //     temp = temp.next;
        //     i++;
        // }

        // return temp;

        // Using Tortoise and Hare Algorithm
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create the linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6); // Uncomment to test even-sized list

        // Print the original list
        System.out.println("Original Linked List:");
        printList(head);

        // Find and print the middle node
        MiddleOfLinkedList solution = new MiddleOfLinkedList();
        ListNode middle = solution.middleNode(head);

        System.out.println("\nMiddle Node Value: " + middle.val);
    }

}
