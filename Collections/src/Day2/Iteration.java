package Day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iteration {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("ABC");
		names.add("XYZ");
		names.add(null);
		names.add("Shailesh");
		names.add("Gaurav");
		
		int[] data = {11,12,13,14,15};
		
		// 1. for loop using index -- only for list
		
//		for(int i=0; i<names.size();i++) {
//			System.out.println("Using for loop and index : " + i + " "+names.get(i));
//		}
		
		// 2. enhanced for loop (for each loop) -- works for any collections / array
		
//		for(String s:names) {
////			System.out.println(s);
//			if(s.startsWith("X")) {
//				names.remove(s);
//			}
//			System.out.println(s);
//		}
		
//		for(int num: data) {
//			System.out.println(num);
//		}
		
		// 3. Iterator -- can be used in any collections
		
//		Iterator<String> itr = names.iterator();
		
		// works only FWD direction
//		System.out.println(names);
//		while(itr.hasNext()) {
//			String name = itr.next();
//			if(name != null && name.startsWith("A")) {
//				itr.remove();
//			}
//		}
//		System.out.println(names);
		
		// 4. listIterator
		
		ListIterator<String> itr2 = names.listIterator();
		
		//works in forward and backword direction
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		System.out.println("");
		
		while(itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
		
	}
}
