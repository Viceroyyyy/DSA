class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class FindLengthOfLoop {
    public int countNodesinLoop(Node head) {
        //      HashMap<Node,Integer> map = new HashMap<>();
    
        // Node temp = head;
        // int count = 0;
        // while(temp!=null){
        //     if(map.containsKey(temp))
        //     return count-map.get(temp);
        //     else{
        //         map.put(temp,count);
        //         count++;
        //     }
    
        //     temp = temp.next;
        // }
    
        // return 0;
        
        Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow==fast){
                slow = slow.next;
                int count = 1;
                while(slow!=fast){
                    count++;
                    slow = slow.next;
                }
                
                return count;
            }
        }
        
        return 0;
        
        
        }

        public static void createLoop(Node head, int position) {
            if (position == 0) return;
    
            Node temp = head;
            Node loopNode = null;
            int count = 1;
    
            while (temp.next != null) {
                if (count == position) {
                    loopNode = temp;
                }
                temp = temp.next;
                count++;
            }
    
            if (loopNode != null) {
                temp.next = loopNode; // Create the loop
            }
        }
    
        // Utility method to print the LinkedList (without loop detection)
        public static void printList(Node head, int limit) {
            Node temp = head;
            int count = 0;
            while (temp != null && count < limit) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
                count++;
            }
            System.out.println(count >= limit ? "..." : "null");
        }
    
        // Main method to test the functionality
        public static void main(String[] args) {
            FindLengthOfLoop finder = new FindLengthOfLoop();
    
            // Creating a LinkedList
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);
    
            // Creating a loop at position 2 (1-based index)
            createLoop(head, 2);
    
            // Testing the countNodesinLoop method
            int loopLength = finder.countNodesinLoop(head);
            if (loopLength > 0) {
                System.out.println("The loop length is: " + loopLength);
            } else {
                System.out.println("No loop detected.");
            }
    
            // Breaking the loop for printing (optional for demonstration)
            head.next.next.next.next.next = null;
    
            // Printing the linked list (limit set to avoid infinite loop)
            System.out.println("Linked list after breaking the loop:");
            printList(head, 10); // Limiting print to 10 nodes to prevent infinite loops
        }
    
}
