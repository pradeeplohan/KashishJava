package array_6;

public class Min {

	public static void main(String[] args) {

		
		// find min of an array
		
		int arr [] = {4,8,21,13,43,2,67,12};
		int min = arr[0];  //4
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i] < min)
			  min = arr[i];  //2
		}
		
		System.out.println("Min element is "+min);
		
	}

}

