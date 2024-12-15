package strings_7;

public class StringDemo2 {

	public static void main(String[] args) {

		String a="Anshul";
		
		System.out.println(a);
		System.out.println(a.endsWith("ul"));
		System.out.println(a.startsWith("n"));
		System.out.println(a.indexOf("h"));
		System.out.println(a.substring(2));
		System.out.println(a.substring(0, 5));
		System.out.println(a.concat(" gaba"));
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.replace("l","u"));
		System.out.println(a.equals("ANSHUL"));
		System.out.println(a.equalsIgnoreCase("ANSHUL"));
		System.out.println(a.trim());
	    System.out.println(a.contains("as"));

	    System.out.println(a.contains("sh"));


		
		
		
	}

}
