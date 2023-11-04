package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//import Day3.Employee;

public class SortEmpList {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
//		numbers.add(79);
//		numbers.add(16);
//		numbers.add(30);
//		numbers.add(44);
//		System.out.println(numbers);
//		
//		System.out.println("");
//		Collections.sort(numbers);
//		System.out.println(numbers);
		
		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(101,"Shailesh",2490));
		emp.add(new Employee(102,"Sakshi",20000));
		emp.add(new Employee(103,"Ayush",31000));
		emp.add(new Employee(104,"Sneha",36000));
		
        Iterator<Employee> itr = emp.iterator();
		
		while(itr.hasNext()) {
				System.out.println(itr.next());
		}
	}
}

class Employee implements Comparable<Employee> {
	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	 public String toString(){
		return "Employee [id = "+ id + ", name = " + name + ", salary = " + salary + "]";
	}

	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
//		return this.id - e.id;
//		return this.salary - e.salary;
		return this.name.compareTo(e.name);
	}
	
	
}

