package Array1;

public class Min_array {

	public static void main(String[] args) {

		
		int arr[]= new int [8];
		int j=10;
		for(int i=0; i<arr.length; i++) {
			arr[i]=j;
			j++;
			
		}
		int min=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
		for(int i=1; i<arr.length; i++) {
			//System.out.println(arr[i]);
		if(arr[i]<min) {
			min= arr[i];
			
		}
		
	}
		System.out.println("min = "+min);
	}


}