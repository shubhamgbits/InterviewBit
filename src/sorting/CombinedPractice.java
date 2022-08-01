package sorting;

public class CombinedPractice {

	public static void main(String[] args) {
		int arr[] = {25, 3, 9, 1, -2, 15, 2};
		arrayprint(arr); System.out.println();
		//bubbleSort(arr);
		//selectionSort(arr);
		//insertionSort(arr);
		mergeSort(arr); arrayprint(arr);
	}
	
	public void quicksort(int pivot, int arr[]) {
		
	}
	
	public static void mergeSort(int[] arr) {
		if(arr.length<2)
			return;
		
		//initialize left right arrays
		int mid = arr.length/2;
		int[] left = new int[mid];
		int[] right = new int[arr.length-mid];
		
 		//populate left right arrays
		for(int i=0; i<mid; i++)
			left[i] = arr[i];
		for(int i=mid; i<arr.length; i++)
			right[i-mid] = arr[i]; // watchout index of right array
		
		//sort left & right
		mergeSort(left);
		mergeSort(right);
		
		//merge left & right
		merge(arr, left, right);
	}
	
	public static void merge(int answer[], int left[], int right[]) {
		//iterators for 3 arrays
		int i=0, j=0, k=0;
		
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
				answer[k]=left[i];
				i++; k++;
			}
			else {
				answer[k]=right[j];
				j++; k++;
			}
		}
		
		while(i<=left.length-1) {
			answer[k]=left[i];
			i++; k++;
		}
		
		while(j<=right.length-1) {
			answer[k]=right[j];
			j++; k++;
		}
	}
	
	
	public static void insertionSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int j=i+1;
			while(j>0 && arr[j]<arr[j-1]) {
				swap(arr, j, j-1);
				j--;
			}
		}
		arrayprint(arr);
	}
	
	public static void selectionSort(int [] arr) {
		
		for(int i=0; i<arr.length; i++) { //This loop represent sorted array on the left. In every iteration a min. element is selected
			int min=arr[i];
			int minIndex=i;
			for(int j=i; j<arr.length; j++) {
				if(arr[j] < min) {
					min=arr[j];
					minIndex=j;
				}					
			}
			if(i!=minIndex)
				swap(arr, i, minIndex);
		}
		arrayprint(arr);
	}
	
	public static void bubbleSort(int[] arr) {
		for(int i=arr.length-1; i>0; i--) { 	//Represent sorted array on the right
			for(int j=0; j<i; j++) {
				if(arr[j]>arr[j+1])
					swap(arr, j, j+1);
			}
		}
		arrayprint(arr);
	}

	public static void swap(int arr[], int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	public static void arrayprint(int arr[]) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}
