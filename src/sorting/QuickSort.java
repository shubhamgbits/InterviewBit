package sorting;

public class QuickSort {
	public static void main(String[] args) {
		int arr[] = {25, 3, 9, 1, -2, 15, 2};
		printarr(arr);
		
		QuickSort qs=new QuickSort();
		qs.quicksort(arr, 0, arr.length-1);
		System.out.print("\nAfter QSort:");
		printarr(arr);
		
	}
	
	public void quicksort(int [] arr, int lowindex, int highindex) {
		if(lowindex >= highindex)
			return;
		
		//Step 1: Choose Pivot
		int pivot=arr[highindex];
		
		//Step 2: Put numbers less than pivot to the left & higher than the pivot to the right. 
		//	we need 2 pointers to traverse array from both sides
		int left=lowindex;
		int right=highindex;
		
		while(left<right) {
			while(arr[left]<= pivot && left < right)
				left++;
			while(arr[right]>=pivot && left < right)
				right--;
			
			//Swapping both numbers
			swap(arr, left, right);			
		}
		//Swap the pivot with left index
		swap(arr, left, highindex);
		
		//recursion
		quicksort(arr, lowindex, left-1);
		quicksort(arr, left+1, highindex);
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
