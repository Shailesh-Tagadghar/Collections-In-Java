package Day3;

import java.util.Queue;
import java.util.PriorityQueue;

public class QueueRemoval {
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer>();
		
		q.add(100);
	    q.add(300);
	    q.add(20);
	    q.add(25);
	    q.add(200);
	    q.add(500);
	    System.out.println(q);
	    
        System.out.println("");
	    q.remove();
	    System.out.println(q);
	    
	    System.out.println("");
	    q.remove(200);
	    System.out.println(q);
	    
	    System.out.println("");
	    q.remove(2000); // nothing happen -- no error
	    System.out.println(q);
	    
	    System.out.println("");
	    System.out.println("Methods of Queue");
	    Integer el = q.element();  //element method -- return first element (head)
	    System.out.println(el);
	    
	    System.out.println("");
	    Integer hd = q.peek(); //peek method -- returns first element or null if queue is empty
	    System.out.println(hd);
	}
}
