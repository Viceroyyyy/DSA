public class LLImplementation {

    public  class Node{
        int data;
        Node next;

        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //Conversion from Array to LL
    public  Node ConvertArrtoLL(int[] arr){
        Node head = null;
        Node tail = null;
        for(int i=0; i<arr.length; i++){
            Node newNode = new Node(arr[i]);

            if(head==null) {
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    public void printll(Node head){
        Node currNode = head;
        //Traversal LL 
        while(currNode != null){
            if(currNode.next == null)
            System.out.println(currNode.data);
            else
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
    }

    public Node deleteHead(Node head){
        if(head == null) return null;

        head = head.next;
        return head;
    }

    public Node deleteTail(Node head){
        if(head == null && head.next==null) return null;

        Node temp = head;
        while(temp.next.next != null) temp = temp.next;

        temp.next = null;

        return head;
    }

    public Node deletePos(Node head,int k){
        if(head==null) return null;

        if(k==1){
            if(head==null)
            return null;
            else 
            {
                head = head.next;
                return head;
            }
        }else{
            Node temp = head;
            int count = 1;
            while(count<k-1 && temp.next.next!=null){
                temp = temp.next;
                count++;
            }
            if(count!=k-1)
            return head;
            else
            temp.next = temp.next.next;   
        }
        return head;
    }

    public Node deleteVal(Node head,int val){
        if(head == null) return null;

        if(head.data == val){
            head = head.next;
            return head;
        }

        Node temp = head;
        while(temp.next.data!=val && temp.next.next!=null){
            temp = temp.next;
        }

        if(temp.next.data!=val){
            return head;
        }else{
            temp.next = temp.next.next; 
        }

        return head;
    }

    public Node insertHead(int data){

    }
    public Node insertTail(int data){

    }
    public Node insertPos(Node head,int k,int data){

    }
    public Node insertVal(Node head,int val,int data){

    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        LLImplementation ll = new LLImplementation();
        
        Node head = ll.ConvertArrtoLL(arr);
        // ll.printll(head);

        head = ll.deleteHead(head);
        ll.printll(head);

        head = ll.deleteTail(head);
        ll.printll(head);

        head = ll.deletePos(head, 4);
        ll.printll(head);

        head = ll.deletePos(head, 5);
        ll.printll(head);

        head = ll.deletePos(head, 5);
        ll.printll(head);

        head = ll.deleteVal(head,4);
        ll.printll(head);

        Node Head ;
        Head = ll.insertHead(100);
        ll.printll(Head);

        Head = ll.insertTail(200);
        Head = ll.insertTail(300);
        ll.printll(Head);

        Head = ll.insertPos(Head, 3,500);
        ll.printll(Head);

        Head = ll.insertVal(Head,300,400);
        ll.printll(Head);
    }
}
