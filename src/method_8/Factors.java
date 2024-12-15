package method_8;

public class Factors {

	public static void main(String[] args) {
       factor(9);
		
	}

	public static void factor(int n ) {
	
		int f=1;
	while(f<=n) {
		if(n%f==0)
		System.out.println(f);
		f++;
		
	}
	
}
}