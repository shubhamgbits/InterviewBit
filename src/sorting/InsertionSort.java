package sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = {25, 3, 9, 1, -2, 15, 2};
		//printarr(arr);
		
		InsertionSort is=new InsertionSort();
		is.myLogic(arr);
		printarr(arr);
		
	}
	
	public int[] myLogic(int arr[]) {
		
		int len=arr.length;
		
		for(int i=0; i<len-1; i++) {
			int j=i+1;
			while(j>0) {
				if(arr[j]<arr[j-1]) 
					swap(arr,j,j-1);
				j--;
			}
			printarr(arr);
		}
		
		return arr;
	}
	
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
