package javaBook;

import java.io.IOException;

public class TakingInput {
	public static void main(String[] args) throws IOException {
		char ch;
		
//		System.out.println("Press a key & then ENTER");
//		ch= (char) System.in.read(); //input is returned as integer so it has to be type-casted
//		System.out.println("You pressed: "+ch);
		
		
		testMethod tm=new testMethod();
		//System.out.println(tm.x);
		tm.multiarray();
	}
	
	
}


class testMethod{
	int x;
	public void multiarray() {
		int[][] sample = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0; i<3;i++)
			for(int j=0; j<3; ++j)
				System.out.print(sample[i][j]);
	}
}
