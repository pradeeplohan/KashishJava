package anshulcode_2;

public class Pallindorme2 {

	public static void main(String[] args) {
   
		int number= 85258;
		 // number= 57845;
		
		int a = number;
		int reverse= 0;
		 while(number != 0) {
			 
			 reverse = reverse*10 +number%10;
			 number= number/10;
		 }
		 System.out.println(reverse);
		 
		 if( reverse== a) {
			 System.out.println("no is pallindrome");
			 
		 }
		 else {
			 System.out.println("no is not pallindrome");
		 }
	}

}
