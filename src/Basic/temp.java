package Basic;

import java.util.ArrayList;
import java.util.List;

public class temp {
	
	public static void main(String[] args) {
		System.out.println("hello");
		
//		int a1 =5/3;
//		float a2 = (float)5.0/3;
//		double a3 = 5.0/3;
//		double a4=5/2;
//		
//		System.out.println(a1);
//		System.out.println(a2);
//		System.out.println(a3);
//		System.out.println(a4);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		
		//Normal
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//Lambda
		list.forEach(i->{
			System.out.println("WooHoo");
		});
		
		//Method reference
		list.forEach(System.out::println);
		
	}
}
