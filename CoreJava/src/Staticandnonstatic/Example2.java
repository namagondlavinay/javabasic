package Staticandnonstatic;

public class Example2 {

	public void test() {
		System.out.println("this is a non static method");
	}

	public static void test1() {
		System.out.println("this is a static method");

	}
	public static void main(String[] args) {
		Example2 obj1 = new Example2();
		obj1.test();
		obj1.test1();
		Example2.test1();
	}

}
