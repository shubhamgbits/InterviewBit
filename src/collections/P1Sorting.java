package collections;

import java.util.Arrays;
import java.util.Comparator;
/*
 * Aim: To learn comparing objects with and without Lambda 
 * 
 */

public class P1Sorting {
	public static void main(String[] args) {
		int a[]=new int[] {50, 9, -2, 98, 71, 10};
		
		Arrays.sort(a);
		for(int i: a)
			System.out.print(i+" ");
		
		sortArrayObject();
		
	}
	
	public static void sortArrayObject() {
		Melon[] melons = new Melon[] {
				new Melon("a", 2), new Melon("b", 1), new Melon("b", 5), new Melon("b", -2), new Melon("b", 0)};
		
		System.out.print("\nBefore:	");
		for(Melon i: melons)
			System.out.print(i.getWeight()+" ");
//		Arrays.sort(melons, new Comparator<Melon>() {
//			@Override
//			public int compare(Melon m1, Melon m2) {
//				return Integer.compare(m1.getWeight(), m2.getWeight());
//			}
//		});
//		
		
		
		//same thing using Lambda
		
		Arrays.sort(melons, (melon2, melon1) -> Integer.compare(melon1.getWeight(), melon2.getWeight()));
		
		//Method 2 using Lambda
		Comparator<Melon> byWeight = Comparator.comparing(Melon::getWeight);//.thenComparing(Melon::getWeight);
		Arrays.sort(melons, byWeight);

		System.out.print("\nAfter:	");
		for(Melon i: melons)
			System.out.print(i.getWeight()+" ");
		
		
		
		
	}
}


