package java8features;

import java.util.function.Function;
import java.util.function.Predicate;

public class intro {
	public static void main(String[] args) {
	
		intro f = new intro();
		System.out.println("Normally: "+ f.square(5));
		
		
		//using Function
		Function<Integer, Integer> f2 = i->i*i;
		System.out.println("Using function: "+f2.apply(4));
		
		//checking given number is even number or not
		Predicate<Integer> p = i->i%2==0;
		System.out.println("2 is even? = "+p.test(2));
		
		Predicate<String> t= i->i.length()%2==0;
		
		
	}
	
	public int square(int a) {
		return a*a;
	}
}
