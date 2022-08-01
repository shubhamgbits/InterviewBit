package sorting;

public class HeapSort {
	
	public static void main(String[] args) {
		
	}
	
	
	//Step 1: Build Max heap 
	//Step 2: Swap largest number (node) with last element
	//Step 3: Remove the largest number
	
	
	public static void swap(int arr[], int a, int b) {
		int temp= arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	public static void printarr(int arr[]) {
		System.out.println();
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}

}
