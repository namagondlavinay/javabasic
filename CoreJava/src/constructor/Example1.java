package constructor;
// constructor is used to creating the objects of class
//default constructor is used to provide default values 0,null...etc
//parameterized constructor is used to provide to different values to distinct objects
//constructor doesn't have a return type
public class Example1 {
	
	public Example1() { // default constructor
		System.out.println("example1()");
			}
public Example1(int a) {//parameterized constructor
	System.out.println("example1(int a)");
}
public static void main(String[] args) {
	Example1 obj = new Example1();
	Example1 obj1 = new Example1(5);
}
}
