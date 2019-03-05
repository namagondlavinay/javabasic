package Staticandnonstatic;

public class Example5 {
	
	public int rollnumber;
	public int age;
	public static String collegename = "SRIT";
	public Example5(int rollnum,int agedata) { // TODO Auto-generated constructor stub
		rollnumber = rollnum;
		age = agedata;
		}
public void display() {
	System.out.println(" rollnumber: "+rollnumber + " age " + age + " collegename " + collegename);	
}
public static void main(String[] args) {
	Example5 obj1 = new Example5(121, 25);
	obj1.display();
	Example5 obj2 = new Example5(122, 26);
	obj2.display();
	Example5 obj3 = new Example5(123, 27);
	obj3.display();
}
}
