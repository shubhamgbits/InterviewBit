package sorting;

import java.util.Random;

//Based on Divide & Conquer
public class MergeSort {
	public static void main(String[] args) {
		int arr[] = {25, 3, 9, 1, -2, 15, 2};
		printarr(arr);
		
		MergeSort ms=new MergeSort();
		//arr=ms.myLogic(arr);
		ms.sort2(arr);
		System.out.print("\nAfter Merge Sort: ");
		printarr(arr);
		
		Random r = new Random();
		for(int i=0;i<arr.length;i++)
			arr[i]=r.nextInt(100);
		printarr(arr);
		ms.sort2(arr);
		printarr(arr);
			
	}
	
	public void sort2(int arr[]) {
		if(arr.length<2)
			return;
		int mid = arr.length/2;
		
		//Initialize size of both divided arrays
		int left[] = new int[mid];
		int right[] = new int[arr.length-mid];
		
		//populate both arrays
		for(int i=0; i<mid; i++)
			left[i]=arr[i];
		for(int i=mid; i<arr.length; i++)
			right[i-mid]=arr[i];
		
		//Now we merge-sort each half of those arrays
		sort2(left);
		sort2(right);
		
		//merge left & right
		merge(arr, left, right);
	}
	
	public static void merge(int result[], int left[], int right[]) {
		
		
		int leftsize=left.length;
		int rightsize=right.length;
		
		//we need 3 iterators for 3 arrays
		int i=0, j=0, k=0;
		
		while(i<leftsize && j<rightsize) {
			//comparing ith element of left array from jth element of right array
		
			if(left[i]<=right[j]) {
				result[k]=left[i];
				i++;
			}
			else {
				result[k]=right[j];
				j++;
			}
			k++;
		}
		
		//if any array is left with elements, copy them into the result array
		while(i<leftsize) {
			result[k]=left[i];
			i++; k++;
		}
		
		while(j<rightsize) {
			result[k]=right[j];
			j++; k++;
		}
	}
	
	public static void printarr(int arr[]) {
		System.out.println();
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
}
