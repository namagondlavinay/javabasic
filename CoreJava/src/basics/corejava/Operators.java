package basics.corejava;

public class Operators {

	public static void main(String[] args) {

		/*
		 * post increment:first use the value in the program then increase pre increment
		 * :first increase the value of a varaible then use the program
		 */
		int i = 0;
		System.out.println(++i);
		int k = 1;
		System.out.println(--k);
		int j = 0;
		System.out.println(j++);
		System.out.println(j);
		System.out.println("...............................");
		int n = 0;
		int m = n++ + ++n;
		System.out.println(m);
		System.out.println("...............................");
		int g = 0;
		int r = g++ + g++;
		System.out.println(r);
		System.out.println("...............................");
		int l = 0;
		int t = l++ + ++l + ++l + l++;
		System.out.println(t);
		System.out.println("...............................");
		int y = 0;
		int u = y++ + ++y + ++y + y++ + ++y;
		System.out.println(u);
		System.out.println("...............................");
		int q = 0;
		int a = ++q + q++ + --q + q-- + q;
		System.out.println(a);
		System.out.println("...............................");
	}
}
