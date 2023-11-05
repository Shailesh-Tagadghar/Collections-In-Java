package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MultipleSort {
	public static void main(String[] args) {
		List<Employe> emp = new ArrayList<>();
		
		emp.add(new Employe(101,"Shailesh",2490));
		emp.add(new Employe(102,"Sakshi",20000));
		emp.add(new Employe(103,"Ayush",31000));
		emp.add(new Employe(104,"Sneha",36000));
		
		Collections.sort(emp,new SortEmpByName());

		
        Iterator<Employe> itr = emp.iterator();
		
		while(itr.hasNext()) {
				System.out.println(itr.next());
		}
	}
}


class SortEmpById implements Comparator<Employe>{
	@Override
	public int compare(Employe e1, Employe e2) {
		return e1.id-e2.id;
	}
}
	
class SortEmpBySalary implements Comparator<Employe>{
	@Override
	public int compare(Employe e1, Employe e2) {
		return e1.salary-e2.salary;
	}
}

class SortEmpByName implements Comparator<Employe>{
	@Override
	public int compare(Employe e1, Employe e2) {
		return e1.name.compareTo(e2.name);
	}
}

class Employe {
	int id;
	String name;
	int salary;
	
	public Employe(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	 

}


