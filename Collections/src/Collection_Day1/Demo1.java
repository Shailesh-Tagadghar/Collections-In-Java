package Collection_Day1;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {
	public static void main(String[] args) {
		int x = 150;
		double d1 = 23.45;
		Collection c = new ArrayList();
		c.add("abcd");
		c.add(101);
		c.add(10.67);
		c.add(true);
		c.add(x);
		c.add(d1);
		System.out.println(c);
		System.out.println(c.size());
	}
}
