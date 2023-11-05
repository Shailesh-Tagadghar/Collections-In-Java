package New_Features_JDK;

public class Day1 {
	public static void main(String[] args) {
//		Child c = new Child();
//		c.test();
		
		Testable t = () -> System.out.println("Lambda for test()");
		t.test();
		t.demo();
	}
}


@FunctionalInterface //ensures that the interface has only 1 abstract method
interface Testable{
	void test();
	
	default void demo() {
		System.out.println("Functional interface can have concrete method as well, but there must be exactly 1 abstract method");
	}
}

//jdk 8 introduced functional programming :
//lambda expression for the methods in functional interface
//for parallel processing
//here there is no need of child class to override the interface method.
//reduces code length, increases performance

//class Child implements Testable {
//	@Override
//	public void test() {
//		System.out.println("child class test()");
//	}
//}
