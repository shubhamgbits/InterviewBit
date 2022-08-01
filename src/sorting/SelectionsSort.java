package sorting;

public class SelectionsSort {
	public static void main(String[] args) {
		int arr[] = {25, 3, 9, 1, -2, 15, 2};
		printarr(arr);
		
		recursive(arr, 0);
		printarr(arr);
		
	}
	
	public static void recursive(int arr[], int index) {
		if(index==arr.length-1)
			return;
		int min_index=index;
		for(int i=index; i<arr.length; i++) {
			if(arr[i]<arr[min_index]) {
				min_index=i;
			}
		}
		
		if(index!=min_index) {
			int temp=arr[index];
			arr[index]=arr[min_index];
			arr[min_index]=temp;
		}
		
		recursive(arr, index+1);
	}
	
	public void mylogic(int arr[]) { // This is Selection Sort 
		int min;
		for(int i=0; i<arr.length; i++) {
			min=arr[i];
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<min) {
					arr[i]=arr[j];
					arr[j]=min;
					min=arr[i];
				}
			}
		}
		//return arr;
	}
	
	public static void printarr(int arr[]) {
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}
