package arrays;

public class P1_MaxContiguousSum {
	
	public static void main(String[] args) {
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};		
		
		int sum = 0;
		int max = -99999; 

		for(int i = 0; i<arr.length; i++){
			sum = sum + arr[i];

			if(arr[i]>sum){
				sum = arr[i];
			}

			if(sum > max)
				max = sum;
		}
		
		System.out.println(max);
	}
}
