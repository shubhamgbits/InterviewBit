package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<>();
		al.add(0);	al.add(5);	al.add(7);	al.add(2); al.add(15); al.add(4);
		
		System.out.println(al);
		
		//Filtering even numbers from an array list
		List<Integer> l1= al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l1);		
		
		//Adding 5 to each element
		List<Integer> l2= al.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(l2);
		
		//Finding min. value
		Integer min= al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
		
		//Convert to integer array
		Integer[] iarray = al.stream().toArray(Integer[]::new);
		
		//Stream of integer array
		Stream.of(iarray).forEach(System.out::println);
		
		
		
	}
	
}
