package javaBook;

public class Rough {
	public static void main(String[] args) {
		Rough r=new Rough();
//		//r.increment();
//		r.primenos();
		
		int[] arr= {5,6,7,8};
		for(int x:arr) System.out.print(x+" ");
		
		String s="""
				Shubham
				Gupta
				""";
		System.out.println(s);

		System.out.println(args.length);
		
		r.varguments(1, 2, 3);
		
		r.varguments();
		
	}
	
	void varguments(int ... v) {
		System.out.println("No. of variables are: "+v.length);
		
		for(var x: v)
			System.out.println(x);
	}
	
	void increment() {
		int x=9;
		int y=x++;
		int z=++x;
		z+=5;
		System.out.println("x="+x+"\ty="+y+"\tz="+z);
	}
	
	void primenos() {
		int total=0;
		for(int j=2; j<=100; j++) {
			int sum=0;
			for(int i=2; i<=100; i++) {
				if(j%i==0)
					sum++;
			}
			if(sum==1) {
				System.out.print(j+" ");
				total++;
			}
		}
		System.out.println("\ntotal= "+total);
	}
}
