package whileloop_4;

public class Factorial {

	public static void main(String[] args) {

	
		int num =7;
		int result = 1;
		
		while(num>=1) {
			
			result = result * num;
			num--;
			
		}
		
		System.out.println(result);
		
	}

}
