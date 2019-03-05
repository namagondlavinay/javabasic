package StringsInJava;

public class String_Equalmethod {
	
	public static void main(String[] args) {
		
		String s1 = "ball";
		String s2 = "ball";
		String s3 = new String("ball");
		String s4 = "Dog";
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		
		String s5 = "nag";
		String s6 = "Nag";
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
				
		
	}
	

}
