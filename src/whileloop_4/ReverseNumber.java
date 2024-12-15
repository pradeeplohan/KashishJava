package whileloop_4;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 23451;
		
		int rev = 0;
		
		while(num!=0) {
			
			rev=rev*10+num%10;  // 0*10 + 1 = 1 (ist case)
			num/=10;
			
			System.out.println(rev);
		}
		
		System.out.println("final reverse = "+rev);
		
		
	}

}
