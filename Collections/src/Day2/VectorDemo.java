package Day2;

import java.util.Vector;
import java.util.Enumeration;

public class VectorDemo {
	public static void main(String[] args) {
		// vector : legacy class (old) from jdk 1.0
		// dynamic array
		
		Vector<Integer> v = new Vector<>();
		System.out.println("Capacity : "+v.capacity()); 
		//default 10 if elemets more than 10 then it will become 20 everytime it will doubl its size suppose you add 21 elements its capacity will become 40;
		
//		v.addElement(12);
//		v.addElement(10);
		
		for(int i = 1; i<=10; i++) {
			v.addElement(i);
		}
		System.out.println(v);
		v.addElement(100);
		System.out.println(v);
		System.out.println("New Capacity : "+v.capacity());
		
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}
}
