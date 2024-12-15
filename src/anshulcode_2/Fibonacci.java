package anshulcode_2;

public class Fibonacci {

	public static void main(String[] args) {

   
	// 0 1 1 2 3 5 8 13 21 34 55 89 144  233 377 610  987
			  int n=17;
			int a=0;
			int b=1;
			 //System.out.println(a);
			// System.out.println(b);
			  n=n-2;
			 while(n>0) {
				 int c=a+b;
				// System.out.println(c);
				  a=b;
				  b=c;
				  n--;
				  
			 }
			 
}
}