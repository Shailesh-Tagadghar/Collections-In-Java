package Day3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(101,"Shailesh",2000));
		emp.add(new Employee(102,"Sakshi",20000));
		emp.add(new Employee(103,"Ayush",31000));
		emp.add(new Employee(104,"Sneha",36000));
		
//		System.out.println(emp);
		
		Iterator<Employee> itr = emp.iterator();
		
		while(itr.hasNext()) {
			
		}
	}
}

class Employee {
	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	
}
