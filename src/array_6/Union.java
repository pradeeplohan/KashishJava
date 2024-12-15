package array_6;

public class Union {

	public static void main(String[] args) {

		int arr1[] = {2,4,3,5,6}; 
		int arr2[] = {3,7,5,1,9};
		
		for (int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
			for (int i=0; i<arr2.length; i++) {
				int flag=0;
				for (int j=0; j<arr1.length; j++) {
					if (arr2[i]== arr1[j]) {
						flag=1;
						break;
					}
					
				}
				if(flag==0) 
					System.out.print(arr2[i]+" ");
		}
		
	}

}

