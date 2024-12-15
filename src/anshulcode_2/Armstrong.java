package anshulcode_2;

public class Armstrong {

	public static void main(String[] args) {

		
		int num= 567;           //5+6+7=18
		num=865438;             // 8+6+5+4+3+8=34
		int sum=0;
		
		while(num>0) {
			sum=sum+ num%10;
			num=num/10;
		}
		System.out.println(sum);
		
		int number=153;
		int n=0;
		int s=number;
		while(number>0) {
			
			n=n+ (number%10)*(number%10)*(number%10);          //0+3*3*3=27        27+5*5*5=152   152+1*1*1=153
			number/=10;                                        // 153  15   1
			
		}
		System.out.println(n);
		
		if(s==n) {
			System.out.println("armstrong no");
		}
		else {
			System.out.println("simple no");
		}
	}

}
