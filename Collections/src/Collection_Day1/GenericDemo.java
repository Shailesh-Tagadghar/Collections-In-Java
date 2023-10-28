package Collection_Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class GenericDemo {
	public static void main(String[] args) {
		int x = 150;
		double d1 = 23.45;
		List c = new ArrayList();
		System.out.println(c.size());
		c.add("abcd");
		c.add(x);
		c.add(d1);
		c.add(true);
//		Collections.sort(c);
		System.out.println(c);
		
		//generic collections
		
		System.out.println("List array : ");
		
		List<Integer> list = new ArrayList<>();
		list.add(150);
//		list.add("23"); this is store only integer value
		list.add(70);
		list.add(250);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		List<String> name = new ArrayList<>();
		
		name.add("Shailesh");
		name.add("Jyoti");
		name.add("Ashok");
		System.out.println(name);
		Collections.sort(name);
		System.out.println(name);
	}
}
