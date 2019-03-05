package Staticandnonstatic;

public class Example3 {
	
	public int i = 90;
	public static int j = 60;
	public void test() {
		System.out.println(i);
		System.out.println(j);
			}
	public static void test1() {
		//System.out.println(i);//non static variables in static method get compile time error
		System.out.println(j);
		
	}
	public static void main(String[] args) {
		Example3 obj1 = new Example3();
		Example3.test1();
		
	}

}
