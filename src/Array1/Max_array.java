package Array1;

public class Max_array {

	public static void main(String[] args) {

		
		int rollno[] = new int [10];
		int max=rollno[0];  //0
		for ( int i=0, j=1; i<rollno.length; i++, j++) {
			rollno[i]= j;
		
			if(rollno[i]>max) 
				max=rollno[i];
				
		
						
		}
		System.out.println(max);
		
	}

}
