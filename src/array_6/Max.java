package array_6;

public class Max {

	public static void main(String[] args) {

		
		// find max of an array
		
		int arr [] = {4,8,21,13,43,15,67,12};
		int max = arr[0];  //4
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]>max)
			  max = arr[i];  //67
		}
		
		System.out.println("Max element is "+max);
		
	}

}
