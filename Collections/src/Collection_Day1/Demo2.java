package Collection_Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(150);
		list.add(70);
		list.add(250);
		list.add(150);
		list.add(null);
		list.add(150);
		list.add(null);
		System.out.println(list);
//		System.out.println(list.indexOf(list));
		System.out.println("second index value : "+list.get(2));
		//Collections.sort(list);
		//System.out.println(list);
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
