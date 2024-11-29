class ListNode {
    int val;
    ListNode next;

    // Constructor
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class LLCycle {
    public boolean hasCycle(ListNode head) {
        //Brute Force 

        //Take a Hashmap Add each Entry with Node value as key and occurence as 1 
        //Check for every temp that whether it ealready exists or not if it does then return true or else return    false at the end.
        // TC - O(N*N) SC = O(N) In TC 1 N is for traversing the LL and other one is for map Operations
         

         //Better Solution

         //TC- O(N) and SC - O(1)

        // ListNode temp = head;

        // while(temp!=null){
        //     if(temp.val==Integer.MIN_VALUE)
        //     return true;
        //     else{
        //         temp.val = Integer.MIN_VALUE;
        //     }
        //     temp = temp.next;
        // }

        // return false;




        //OPtimal Solution Using Tortoise and Hare Algorithm 
        
        if(head==null || head.next==null||head.next.next==null)
        return false;
        ListNode slow = head;
        ListNode fast = head;

            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;

                if(slow==fast)
                return true;

                
            }

            return false;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        LLCycle llCycle = new LLCycle();

        // Creating a LinkedList with a cycle
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next; // Creating a cycle

        // Testing the hasCycle method
        if (llCycle.hasCycle(head)) {
            System.out.println("The linked list has a cycle.");
        } else {
            System.out.println("The linked list does not have a cycle.");
        }

        // Breaking the cycle for testing printList (optional)
        head.next.next.next.next = null;

        // Printing the linked list
        System.out.println("Linked list after breaking the cycle:");
        printList(head);
    }

}
