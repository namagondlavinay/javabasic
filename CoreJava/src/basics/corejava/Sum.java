package basics.corejava;

public class Sum {
	
	int i =10,j=20;
	
	public void sum() {
		
		int sum = i + j;
		System.out.println("sumof two number is:");
	}
	
	public static void main(String[] args) {
		Sum obj = new Sum();
		obj.sum();
		
	}

}
