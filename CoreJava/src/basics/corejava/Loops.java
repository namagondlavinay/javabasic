package basics.corejava;

public class Loops {
	public static void main(String[] args) {
		/*
		 * simple For Loop, For-each or enhanced For Loop ,labeled For Loop
		 */
		for (int j = 0; j <= 4; j++) {
			System.out.println("value of data is:" + j);
		}
		System.out.println("...............................");
		// For-Each Loop
/*
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("...............................");
		*/
		String arr1[] = { "vinay", "kumar", "java", "siva", "kamakshi" };
		for (String s : arr1) {
			System.out.println(s);
					}
		System.out.println("...............................");
	
		// labeled For Loop 
			aa:for(int a=1;a<=3;a++) {
			bb:for(int b=1;b<=3;b++) {
				if(a==2 && b==2) {
					break aa;
				}
				System.out.println(a + " " + b);
			}
	}
		System.out.println("...............................");

		//while loop
		
		int q = 1;
		while(q<9) {
			q++;
			System.out.println(q);
		}
		
	}
}
			
		



