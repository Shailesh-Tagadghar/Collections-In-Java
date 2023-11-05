package New_Features_JDK;

public class MathDemo {
	public static void main(String[] args) {
		MathOperation add = (x,y) -> System.out.println("Addition of "+ x + " + " + y + " = " + (x+y));
		add.calc(2,4);
		System.out.println("");
		
		MathOperation sub = (x,y) -> System.out.println("Substraction of "+ x + " - " + y + " = " + (x-y));
		sub.calc(24,4);
		System.out.println("");
		
		MathOperation mul = (x,y) -> System.out.println("Multiplication of "+ x + " * " + y + " = " + (x*y));
		mul.calc(4,4);
		System.out.println("");
		
		MathOperation div = (x,y) -> System.out.println("Division of "+ x + " / " + y + " = " + (x/y));
		div.calc(4,2);
		System.out.println("");
		
		//with return method
		Showable s = name -> {
			return "Welcome " + name;
		};
		System.out.println(s.greet("Amit"));
		System.out.println("");
		
		Showable s1 = name -> "Hello "+ name;
		System.out.println(s1.greet("Amit"));
		System.out.println("");
		
		Power p = (y,z) -> Math.pow(y, z);
		System.out.println("Power if 5 ^ 3 is "+p.power(5,3));
	}
}

interface MathOperation {
	void calc(int n1,int n2);
}

interface Showable{
	String greet(String Name);
}

interface Power{
	double power(int a,int b);
}
