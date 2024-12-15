package firstproject_1;

public class ThreeNumbers {

	public static void main(String[] args) {
		
		
		int a=7,b=14,c=13;
		
		// find smallest of 3 no's
		if(a<b) {
			// b is eliminated 
			if(a<c) 
				System.out.println("a is smallest");
			
			else 
				System.out.println("c is smallest");
			
		}
		else {
			//a is eliminated
			if(b<c) 
				System.out.println("b is smallest");
			
			else 
				System.out.println("c is smallest");
			
		}
	}
}
