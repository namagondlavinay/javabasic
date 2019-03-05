package constructor;

public class Example2 {
	// when we create parameterized constructor (with out creating constructor)
	public Example2(int a) {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	//Example2 obj = new Example2(); 
	// compile time error because the java compiler wont put default constructor 
	//(i.e we created only parameterized constructor not default
	Example2 obj1 = new Example2(2);
}
}
