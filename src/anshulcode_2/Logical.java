package anshulcode_2;

public class Logical {

	public static void main(String[] args) {
		
		int a=2;
		int b=3;
		if(a==2 && b>=5) {
		
		System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
		if(a==2 || b>=5) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		a=10;  
      if(!(a<=5)) {                 //right
    	  System.out.println("right");
      }
      else {
    	  System.out.println("wrong");
      }
	}

}
