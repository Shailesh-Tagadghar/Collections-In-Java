package Collection_Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
//		list.add(150);
//		list.add(70);
//		list.add(250);
//		list.add(150);
//		list.add(null);
//		list.add(150);
//		list.add(null);
		
		list.add(100);
		list.add(200);
		list.add(300);
		System.out.println(list);
//		System.out.println("second index value : "+list.get(2));
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(11);
		list2.add(12);
		list2.add(13);
		System.out.println(list);
	
		list.addAll(list2);
		System.out.println("after addALL() : "+list);
		
		list.removeAll(list2);
		System.out.println("after removeAll() : "+list);
		
		list.retainAll(list2);
		System.out.println("after retainAll() : "+list2);
	}
}
