package Array1;

public class Sumofeven {

	public static void main(String[] args) {

		
		
		int arr[]=  {2,6,5,1,7,3,4};
		int sum=0;
		int oddsum=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==0) {
				sum+=arr[i];
			}
			else {
				//if(!(arr[i]%2==0))
				{
					oddsum+=arr[i];
				}
				
				}
		}
		System.out.println(sum);		
		System.out.println(oddsum);
		
		
		
		
	}
}