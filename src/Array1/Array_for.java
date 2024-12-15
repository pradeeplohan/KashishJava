package Array1;

public class Array_for {

	public static void main(String[] args) {

		int arr[]= new int[100];
		int a=1;
		for (int i =0; i <arr.length; i++) {
			arr[i]=a;
			
			a++;
			
		}
		
		for(int i=0; i<arr.length; i++) {
			 System.out.println(arr[i]);
		}
	}

}
