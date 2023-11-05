package New_Features_JDK;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class LambdaForEach {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(25);
		list.add(34);
		list.add(45);
		list.add(85);
		
//		Iterator<Integer> itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		Consumer c = obj -> System.out.println(obj * obj);
//		list.forEach(c);
		
		list.forEach(obj -> System.out.println(obj));
	}
}
