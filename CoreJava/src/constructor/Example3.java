package constructor;
// constructor overloading is possible 
public class Example3 {
public Example3() {
	System.out.println("iam example3()");
}
public Example3(int i,int j) {
	System.out.println("iam example3() of int i and int j");
}
public Example3(int i,int j,int k) {
	System.out.println("iam example3() of int i and int j int k");
}

public static void main(String[] args) {
	Example3 obj = new Example3();
	Example3 obj1 = new Example3(2,3);
	Example3 obj2 = new Example3(2,3,4);
}

}
