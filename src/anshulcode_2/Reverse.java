      package anshulcode_2;

public class Reverse {

	public static void main(String[] args) {
   
		int num=98564;
		num= 36578;
		
		int reverse = 0;
		
		while(num!=0) {
			reverse= reverse*10 +num%10;
			num= num/10;
			
		}
		System.out.println(reverse);
	}

}
