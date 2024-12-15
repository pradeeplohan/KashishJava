package array_6;

public class Array {

	public static void main(String[] args) {

		
		int arr [] = new int[7];
		
		
		
		for(int i=0, j=40 ;i<arr.length; i++,j--) {
			arr[i]=j;
		}
		
		//arr[0] =40
		//1 = 39
		
	

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
