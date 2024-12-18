

public class DLLImplementation {
    public  class Node{
        int data;
        Node next;
        Node prev;

        Node(int data,Node next,Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
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
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    public void printll(Node head){
        Node currNode = head;
        Node tail = null;
        //Traversal LL 
        while(currNode != null){
            if(currNode.next == null)
            System.out.println(currNode.data);
            else
            System.out.print(currNode.data+"->");
            tail = currNode;
            currNode = currNode.next;
        }
        while(tail != null){
            if(tail.prev == null)
            System.out.println(tail.data);
            else
            System.out.print(tail.data+"->");
            tail = tail.prev;
        }
    }

    public Node deleteHead(Node head){
        if(head == null) return null;

        head = head.next;
        head.prev = null;
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
                head.prev = null;
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
            {
                if(temp.next.next!=null)
                temp.next.next.prev = temp;

                temp.next = temp.next.next;
            }  
        }
        return head;
    }

    public Node deleteVal(Node head,int val){
        if(head == null) return null;

        if(head.data == val){
            head = head.next;
            head.prev = null;
            return head;
        }

        Node temp = head;
        while(temp.next.data!=val && temp.next.next!=null){
            temp = temp.next;
        }

        if(temp.next.data!=val){
            return head;
        }else{
            if(temp.next.next != null)
            temp.next.next.prev = temp;

            temp.next = temp.next.next; 
        }

        return head;
    }

    public Node insertHead(int data){
        return new Node(data);
    }
    public Node insertTail(Node Head,int data){
        if(Head == null) return new Node(data);
        Node temp = Head;
    
        while(temp.next!=null){
            temp = temp.next;
        }

        Node newNode = new Node(data);
        temp.next = newNode;
        newNode.prev = temp;
        return Head;
    }

    public Node insertPos(Node Head,int k,int data){
        Node newNode = new Node(data);

        if(k==1){
            if(Head==null) return newNode;

            newNode.next = Head;
            Head.prev = newNode;
            Head = newNode;
            return Head;
        }

        Node temp = Head;
        int count = 1;

        while(count<k-1 && temp.next!=null){
            temp = temp.next;
            count++;
        }

        newNode.next = temp.next;

        if(temp.next!=null)
        temp.next.prev = newNode;

        temp.next = newNode;
        newNode.prev = temp;
        return Head;
    }
    public Node insertAfterVal(Node Head,int val,int data){
        Node newNode = new Node(data);

        Node temp = Head;

        while(temp.data!=val && temp.next!=null){
            temp = temp.next;
        }

       newNode.next = temp.next;

        if(temp.next!=null)
        temp.next.prev = newNode;
        
        temp.next = newNode;
        newNode.prev = temp;
        return Head;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        DLLImplementation ll = new DLLImplementation();
        
        Node head = ll.ConvertArrtoLL(arr);
        ll.printll(head);

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
        head = ll.deleteVal(head,6);
        ll.printll(head);

        Node Head ;
        Head = ll.insertHead(100);
        ll.printll(Head);

        Head = ll.insertTail(Head,200);
        Head = ll.insertTail(Head,300);
        ll.printll(Head);

        Head = ll.insertPos(Head, 4,500);
        ll.printll(Head);
        Head = ll.insertPos(Head, 3,250);
        ll.printll(Head);

        Head = ll.insertAfterVal(Head,300,400);
        ll.printll(Head);

        Head = ll.insertAfterVal(Head,500,600);
        ll.printll(Head);
    }
}
