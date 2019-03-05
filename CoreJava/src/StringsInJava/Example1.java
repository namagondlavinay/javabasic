package StringsInJava;
/*
 *1. String is a class.
  2. String represents set of characters.
  3. String is immutable i.e. it cannot be changed , It is final
 */

public class Example1 {
	
public static void main(String[] args) {
	/*
	 * There are two ways to create String object:
			1. By string literal
			2. By new keyword
	 */
	
	String s1 = "vinay";
	String s2 = "kumar";
	String s3 = "namagondla";
	//converting char array to string
	char ch[]= {'t','e','s','t'};
	String s4 = new String(ch);
	char ch1[]= {'w','e','s','t'};
	String s5 = new String(ch1);
	char ch2[]= {'n','e','s','t'};
	String s6 = new String(ch2);
	char ch3[]= {'r','e','s','t'};
	String s7 = new String(ch3);	
	//creating java string object by new keyword
	String s8 = new String("Example");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	System.out.println(s5);
	System.out.println(s6);
	System.out.println(s7);
	
}
}
