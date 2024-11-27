class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class ReverseADLL {
    public DLLNode reverseDLL(DLLNode head) {

        //BRUTE FORCE

        // DLLNode temp = head;
        // DLLNode tail = null;
        // int count = 1;
        // while(temp.next!=null){
        //     temp = temp.next;
        //     tail = temp;
        //     count++;
        // }
        
        // temp = head;
        // if(count==1)
        // return head;
        // if(count%2==0){
        //     while(temp.next!=tail && tail.prev!=temp){
        //         int swap = temp.data;
        //         temp.data = tail.data;
        //         tail.data = swap;
                
        //         temp=temp.next;
        //         tail=tail.prev;
        //     }
            
        //      int swap = temp.data;
        //         temp.data = tail.data;
        //         tail.data = swap;
        // }else{
        //     while(temp.next!=tail.prev){
        //         int swap = temp.data;
        //         temp.data = tail.data;
        //         tail.data = swap;
                
        //         temp=temp.next;
        //         tail=tail.prev;
        //     }
        //     int swap = temp.data;
        //         temp.data = tail.data;
        //         tail.data = swap;
        // }
        
        // return head;
        
        //Alternative Solution Use Stack


        //Optimal Solution - Reverse the Links
        

        DLLNode temp = head;
        DLLNode last = null;
        
        if(head.next==null && head.prev==null)
        return head;
        while(temp!=null){
            last = temp.prev;
            temp.prev = temp.next;
            temp.next = last;
            
            temp = temp.prev;
        }
        
        return last.prev;
    }

    public static void printList(DLLNode head) {
        DLLNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        DLLNode head = new DLLNode(1);
        head.next = new DLLNode(2);
        head.next.prev = head;
        head.next.next = new DLLNode(3);
        head.next.next.prev = head.next;
        head.next.next.next = new DLLNode(4);
        head.next.next.next.prev = head.next.next;

        System.out.println("Original List:");
        printList(head);

        ReverseADLL reverse = new ReverseADLL();
        head = reverse.reverseDLL(head);

        System.out.println("Reversed List:");
        printList(head);
    }

}
