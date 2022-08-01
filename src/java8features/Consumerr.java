package java8features;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Consumerr {
	public static void main(String[] args) {
		//consumer is used when there is no return type for the required function
		
		int arr[] = {5, 6, 7, 19, 25};
		
		Consumer<int[]> arrayPrint = i->{
			for(int j:i)
				System.out.print(j+" ");				
		};
		
		arrayPrint.accept(arr);
		
		Consumer<int[]> arrayPrint2 = i->Stream.of(i).forEach(System.out::print);
		arrayPrint2.accept(arr);
	}
}
