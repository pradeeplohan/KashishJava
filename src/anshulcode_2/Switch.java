package anshulcode_2;

public class Switch {

	public static void main(String[] args) {

		
		String c ;
		
		switch("beverages") {
		
		case "fruits": System.out.println("apple");
		               System.out.println("mango");
		               System.out.println("banana"); 
		               break;
		case "vegetable": System.out.println("potato");
		                  System.out.println("brinjal");
	                   	  System.out.println("tomato");
		                  System.out.println("onion");
		                  break;
		case "sweets":  System.out.println("barfi");
		                System.out.println("rasgulla");
		                System.out.println("laddoo");
		                break;
		case "beverages":  System.out.println("soft drinks ");
                            System.out.println("shakes");
                            break;
		default: System.out.println("error");
		
		
		}
		
		
	}

}
