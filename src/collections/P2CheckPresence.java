package collections;

import java.util.Arrays;

public class P2CheckPresence {
	public static void main(String[] args) {
		int a[]=new int[] {50, 9, -2, 98, 71, 10};
		
		//Traditional method: Using loop
		
		//M2: Using Arrays collection
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 10));
		
		//M3: Using stream
		System.out.println(Arrays.stream(a).anyMatch(i -> i==20));
	}
}
