package Day3;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> contacts = new HashMap<String, Integer>();
		// <String == Key, Integer == Value>
		
		contacts.put("sachin",98786);
		contacts.put("shailesh",64378);
		contacts.put("sakshi",75489);
		contacts.put("omkar",45648);
		System.out.println(contacts);
		contacts.put("omkar",4898); // don't take repeated value
		System.out.println(contacts);
		
		// key value pairs are called as Entry
		// Map stores the Entries
		// Duplicates keys are not allowed
		
		
		// All the rules are for key (no rule for values)
		// HashMap : Keys are unordered , single Null key is allowed
		// linkedHashMap : keys follow the insertion order, single Null key is allowed
		// TreeMap : Keys are in ascending order ,  Null key is not allowed
		
		System.out.println("");
		System.out.println(contacts.get("sachin"));
		
		System.out.println("");
		contacts.remove("omkar");
		System.out.println(contacts);
		
		Map<Integer,Employee> emp = new HashMap<>();
		emp.put(101,new Employee(100,"Sat",23000));
		emp.put(102,new Employee(105,"Rat",26000));
		emp.put(103,new Employee(109,"Jat",24000));
		
	}
}
