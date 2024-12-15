package anshulcode_2;

public class Pallindorme {

	public static void main(String[] args) {
   
		int num=123211;
		int a = num;
		// 12321
		//123321
		int reverse = 0;
		
		while(num!=0) {
			reverse= reverse*10 +num%10;
			num= num/10;
			
		}
		System.out.println(reverse);
		if(reverse== a)
			System.out.println("number is pallindrome");
		else
			System.out.println("number is not pallindrome");
	}

}
