package sorting;

public class BubbleSort {
	public static void main(String[] args) {
		
		int arr[] = {25, 3, 9, 1, -2, 15, 2};
		printarr(arr);
		
		BubbleSort bs=new BubbleSort();
		arr=bs.mylogic(arr);
		
		int brr[] = {25, 3, 9, 1, -2, 15, 2};
		brr=bs.booklogic(brr);
		printarr(arr);
		System.out.print("\nBook Logic");
		printarr(brr);
	}
	
	public int[] booklogic(int arr[]) {
		
		int len=arr.length;
		
		for(int i=0; i<len-1; i++) { // Tells the length of RHS sorted array
			for(int j=0; j<len-1-i; j++) {
				if(arr[j]>arr[j+1]) { //SWAP
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		return arr;
	}
	
	public int[] mylogic(int arr[]) { // This is Insertion Sort 
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
		return arr;
	}
	
	public static void printarr(int arr[]) {
		System.out.println();
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
}
