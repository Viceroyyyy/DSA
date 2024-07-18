package Collections;
import java.util.*;
public class Practice {
   public static void main(String[] args){

    PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder()); //For Max Heap
    PriorityQueue<Integer> newpq=new PriorityQueue<>();//For Min Heap
    
    
    pq.offer(40);
    pq.offer(12);
    pq.offer(24);
    pq.offer(36);
    
     newpq.offer(40);
     newpq.offer(12);
     newpq.offer(24);
     newpq.offer(36);
    
    System.out.println(pq);
     System.out.println(pq.poll());
     System.out.println(pq.peek());
     
     System.out.println(newpq);
     System.out.println(newpq.poll());
     System.out.println(newpq.peek());

   }
    
}
