package strings_7;

public class StringDemo {

	public static void main(String[] args) {

		
		String s = "Kashish";
		
		System.out.println(s.charAt(1));
		
		
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println("Anshul".concat(" Gaba"));
		System.out.println(s.trim());
		System.out.println(s.indexOf("h"));
		System.out.println(s.equals("KAShish"));
		System.out.println(s.equalsIgnoreCase("KAShish"));
		System.out.println(s.contains("ash"));
		System.out.println(s.contains("ashh"));
		System.out.println(s.endsWith("sh"));
		System.out.println(s.startsWith("K"));
		System.out.println(s.substring(3));
		System.out.println(s.substring(0, 5));
		System.out.println(s.replace("h", "k"));
	}

}
