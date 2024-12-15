package array_6;

public class Intersection {

	public static void main(String[] args) {

		int arr1[] = {2,4,3,5,6}; 
		int arr2[] = {3,7,5,1,9};
		
		for(int i=0; i<arr1.length; i++) {
			for (int j=0; j<arr2.length; j++) 
			{
				
				if (arr1[i]==arr2[j]) {
					
				
						System.out.println(arr1[i]);
				}
			}
		}
		
		
		
	}

}

