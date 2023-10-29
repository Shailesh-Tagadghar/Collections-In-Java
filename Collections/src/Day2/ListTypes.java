package Day2;

import java.util.LinkedList;

public class ListTypes {
	public static void main(String[] args) {
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		
		linkedlist.add(150);
		linkedlist.add(34);
		linkedlist.add(50);
		linkedlist.add(78);
		linkedlist.add(67);
		
//		System.out.println(linkedlist);
		
//		linkedlist.addFirst(100);
//		linkedlist.addLast(10);
//		
//		System.out.println(linkedlist);
//		linkedlist.set(0, 1000);//replace the 0-th index value
//		System.out.println(linkedlist);
		
//		linkedlist.element(); // always give 1st element in collection
//		linkedlist.getFirst(); // always give 1st element in collection
//		linkedlist.getLast(); // always give last element in collection
//		linkedlist.lastIndexOf(67);
		linkedlist.offer(45); //add next to last index
		linkedlist.offerFirst(0); // add to 1st index
		linkedlist.offerLast(null); //add next to last index
//		System.out.println(linkedlist);
		
		
		LinkedList<String> names = new LinkedList<String>();
		names.add("A");
		names.add("B");
		names.add("C");
		
//		String n = names.get(0);
//		System.out.println(n);
		
		String e =  names.element();
		System.out.println(e);
		
	}
}
