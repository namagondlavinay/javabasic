package returntype;

//type of return value must match the methods declared return type
//we can't return an integer value from a method whose declaration type is void

public class Returntypeinjava {
	public void test1() {

	}

	public int test2() {
		return 3;
	}

	public double test3() {
		return 3.99;
	}

	public boolean test4() {
		return true;
	}

	public String test5() {
		return "viany";
	}

	public char test6() {
		return 'a';
	}

	public Returntypeinjava test7() {
		return new Returntypeinjava();
	}

	public int[] test8() {
		return new int[7];
	}

	public static void main(String[] args) {
		Returntypeinjava obj = new Returntypeinjava();
		int a[] = new int[5];
		System.out.println(obj.test5());
	}
}
