package anshulcode_2;

public class Revision {

	public static void main(String[] args) {

		// arithmetic
		int a= 34;
		int b = 45;
		
		int sum = a+b;    //79
		System.out.println("total"+"="+ sum);
		
		int minus= b-a;   //11
		System.out.println("subtract="+ minus);
		
		int mul= a*b;    //1530
		System.out.println( "multiply="+ mul);
		
		float div = b/a;    //1.3
		System.out.println("divide="+ div);
		
		//logical or if else
		
		if(a<=50 && b>=50) {                 // false
			System.out.println("condition true");
		}
		else {
			System.out.println("condition false");
			
		}
		
		// assignment and unary
		
		a+=5;   // 39
		System.out.println(a);
		b--;   // 44
		System.out.println(b);
		
		//ternary
		
		String number;
		String number2;
		
		number= (a%2==0) ? "divisible by 2" : "not divisible";
		System.out.println(number);

		number2= (b%2==0) ? "divisible by 2" : "not divisible";
		System.out.println(number2);
		
		// for loop
		int c;
		for(c=7; c<=10; c++) {
			System.out.println(c);
		}
		
		
		int table;
		int no=5;
		for(table=1; table<=10; table++) {
			System.out.println(table*no);
		}
		
		//while(reverse+factorial)
		int oneno=65387;
		int reverse=0;
		while(oneno!=0) {
			reverse= reverse*10 +oneno%10;
			oneno = oneno/10;
		}
		System.out.println(reverse);
		
		int no2=8;
		int fac=1;
		while(no2>1) {
			fac= fac*no2;
			no2--;
		}
		System.out.println(fac);
		
		//pallindrome
		String num;
		num= (oneno==reverse)? "pallindrome": "not pallindrome";
		System.out.println(num);
	

	//factors
		int k=24;
		int g =1;
		while(g<=k) {
			if(k%g==0)
				System.out.println(g);
			g++;
			
		}
		
		// fabonacci
		System.out.println();
		
		int i=13;
		
		int j=0;
		int x=1;
		System.out.print(j+" ");
		System.out.print(x+" ");
		i=i-2;
		
		while(i>0) {
			int w=j+x;
			System.out.print(w+" ");
			j=x;
			x=w;
			i--;
		}
	
		//tables
		 j =13;
		 x=1;
		System.out.println( );
		while(x<=10) {
			System.out.print(x*j+" ");
			x++;
		}
	
	
}

}
