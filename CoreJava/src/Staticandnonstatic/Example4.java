package Staticandnonstatic;
// every object has a copy of non static members
public class Example4 {
	public static int counter = 0;
	public int i = 0;

	Example4() { // constructor
		counter++;
		i++;
		System.out.println("value of i is:" + i +" value of counter is:" +counter);
		//System.out.println("iam a constructor");
	}

	public static void main(String[] args) {
		Example4 obj1 = new Example4();
		Example4 obj2 = new Example4();
		Example4 obj3 = new Example4();
	}
}
