package Staticandnonstatic;

public class Example1 {
public int i = 90; // non static variable
public static int j =80;
public static void main(String[] args) {
	// to access non static variables we need to create the object
	Example1 obj = new Example1();
	System.out.println(obj.i);
	System.out.println(obj.j);// but still we will access both static and non static variables through object
	// to access static variables no need to create the object we can access directly
	System.out.println(Example1.j);
	//System.out.println(Example1.i);// compile time error
	
}
}
