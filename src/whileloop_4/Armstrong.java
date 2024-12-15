package whileloop_4;

public class Armstrong {

	public static void main(String[] args) {

		
		int n = 407;
		int t=n;
		int sum = 0;
		
		while(n>0) {
			sum=sum+ (n%10)*(n%10)*(n%10) ;
			n/=10;
		}

		System.out.println(sum);
		
		if(t==sum)
			System.out.println("Armstrong number");
		else
			System.out.println("Not Armstrong number");
	}

}
