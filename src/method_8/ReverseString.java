package method_8;

public class ReverseString {

	public static void main(String[] args) {

		String out = reverse("Kashu");
		System.out.println(out);
		
	}
	
	
	
	public static String reverse(String in) {
		
		String rev ="";
		for(int i=in.length()-1; i>=0 ;i--) {
			rev =rev+in.charAt(i);
		}
		
		return rev;
		
	}

}
