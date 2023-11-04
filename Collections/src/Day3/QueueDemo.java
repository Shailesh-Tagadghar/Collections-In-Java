package Day3;

import java.util.Queue;
import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[] args) {
		/*
		 Allows Duplicate
		 Null values not allowed
		 first in first out --> one way only --> reverse is not possible;
		 unordered
		 methods:
		 1. element 2.peek 3. poll 4. offer
		 */
		
		Queue<Integer> data = new PriorityQueue<Integer>();
		
		    data.add(100);
//		    data.add(null);
		    data.add(300);
		    data.add(20);
		    data.add(25);
		    data.add(200);
		    data.add(500);
		    System.out.println(data);
		    
		    System.out.println("");
		    
		    data.remove(); //remove the head element (first)
		    System.out.println(data);
		    
		    System.out.println("");
		    
		    data.offer(97);
		    System.out.println(data);
		    
            System.out.println("");
		    
		    data.offer(97);
		    System.out.println(data);
	}
}
