package strings_7;

public class CharCount {

	public static void main(String[] args) {
		
		String str = "chamahc";
		char c = 'h';
		int count =0;
		
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
		
	}
	
}
