class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
    // Stack<Integer> st = new Stack<>();
    ListNode temp = head;
    ListNode last = null;

//     while(temp!=null){
//         st.push(temp.val);
//         temp = temp.next;
//     }
// temp = head;
//     while(temp!=null){
//         temp.val = st.peek();
//         st.pop();
//         temp = temp.next;
//     }
    

    while(temp!=null){
        ListNode forward = temp.next;
        temp.next = last;
        last = temp;
        temp = forward;
    }
    return last;
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
