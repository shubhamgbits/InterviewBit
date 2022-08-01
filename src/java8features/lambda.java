package java8features;

public class lambda {
	
	public static void main(String[] args) {
		
		//Hello world function using lambda
		interf i =()->System.out.println("hello"); 
		
		i.m1();
		
		
	}

}

@FunctionalInterface
interface interf{
	public void m1();
}