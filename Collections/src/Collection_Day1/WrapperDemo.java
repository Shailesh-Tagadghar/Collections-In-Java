package Collection_Day1;

public class WrapperDemo {
	public static void main(String[] args) {
		int x = 100;
		Integer x_obj = x; //auto boxing
		
		//boxing
		Integer x_obj_2 = Integer.valueOf(x);
		
		//unboxing
		Integer i = new Integer(150);
		int y = 1;
		
		int y2 = i.intValue();
	}
}
