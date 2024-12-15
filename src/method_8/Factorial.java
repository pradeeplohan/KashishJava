package method_8;

public class Factorial {

	public static void main(String[] args) {

		int output = factorial(5);
		System.out.println("Output = "+output);
		
		
	}
	
	
	public static int factorial(int num) {
		
		int result = 1;
		
		while(num>=1) {
			
			result = result * num;
			num--;
			
		}
		
		System.out.println("Result = "+result);
		return result;
		
	}

}
