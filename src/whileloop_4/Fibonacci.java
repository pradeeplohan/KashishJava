package whileloop_4;

public class Fibonacci {

	public static void main(String[] args) {

		//0 1 1 2 3 5 8 13 21 34 55 
		
		int n = 21;
		
		int a=0;
		int b=1;
		
		System.out.print(a +" " );
		System.out.print(b+" ");
		
		n=n-2;
		
		
		while(n>0) {
			int c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			n--;
		}
		
		
		
		
		
	}

}
