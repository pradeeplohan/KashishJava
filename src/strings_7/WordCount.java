package strings_7;

public class WordCount {

	public static void main(String[] args) {
		
		String str = "My name is Kashish and I am the best.I live in sudama nagar.";
		int count =0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) ==  ' ' || str.charAt(i)=='.')
				count++;
			
		}
		System.out.println(count);
	}
	
}
