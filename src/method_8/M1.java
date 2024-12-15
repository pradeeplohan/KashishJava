package method_8;

public class M1 {

	public static void main(String[] args) {

		calculateSum(4,5,"erty");
		int a =sum1(6,7);
		System.out.println("sum1 ="+a);
	}
	
	
	public static void calculateSum(int a , int b, String x) {
		int c = a+b;
		System.out.println(x);
		System.out.println("sum ="+c);
	}

	public static int sum1(int a , int b) {
		int c = a+b;
		return c;
	}

	
}
