package constructor;
// by using constructor to initialize the global variables using (this)
public class Example4 {
	int i;
	int j;
	public Example4 (int i,int j) {
		this.i = i;
		this.j= j;
	}

	public static void main(String[] args) {
		Example4 obj = new Example4(2, 8);
		System.out.println(obj.i);
		System.out.println(obj.j);
	}
}
