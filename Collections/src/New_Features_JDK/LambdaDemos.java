package New_Features_JDK;

public class LambdaDemos {
	public static void main(String[] args) {
		Check c = (x) -> System.out.println("the number is : "+x);
		c.evenOdd(10);
		System.out.println("");
		
		Check c1  = (x) -> System.out.println((x % 2 == 0) ? "Number is Even" : "Number is Odd");
		c1.evenOdd(15);
		c1.evenOdd(24);
		System.out.println("");
		
		Check c2 = (x) -> {
			if(x % 2 ==0) {
				System.out.println(x+" is Even number");
			}
			else { 
				System.out.println(x+" is Odd number");
			}
		};
		c2.evenOdd(10);
		c2.evenOdd(13);
	}
}

interface Check {
	void evenOdd(int num);
}