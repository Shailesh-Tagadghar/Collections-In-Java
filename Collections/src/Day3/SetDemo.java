package Day3;

import java.util.TreeSet;
import java.util.HashSet;

public class SetDemo {
	public static void main(String[] args) {
		/*
		 1. unique objects
		 2. single null is allowed (not in Tree set)
		 3. unordered - (depends on class)
		 Hash Set - unordered
		 LinkedHashSet - insertion order
		 Tree Set - ascending order
		 (indexing is not supported, does not have any methods of its own)
		 
		 
		 */
		HashSet<Integer> data = new HashSet<>(); // in hash set only one null value is acceptable
	    
	    data.add(100);
	    data.add(null);
	    data.add(300);
	    data.add(200);
	    data.add(500);
	    data.add(null);
	    System.out.println(data);
	    
	    System.out.println("");
	    
	    TreeSet<Integer> data1 = new TreeSet<>(); // in tree set null is not allowed
	    
	    data1.add(100);
//	    data1.add(null);
	    data1.add(300);
	    data1.add(200);
	    data1.add(500);
//	    data1.add(null);
	    System.out.println(data1);
	}
}
