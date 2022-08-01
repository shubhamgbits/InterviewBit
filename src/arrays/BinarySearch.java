package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {25, 3, 9, 1, -2, 15, 2};
		
		Arrays.sort(arr);
		List<Integer> arr2 = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(arr2);
		
		
	}
}
