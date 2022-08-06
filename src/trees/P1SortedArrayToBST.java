package trees;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Minimal BST: BST with minimum height
 * 
 * 
 * Step 1: Choose middle of sorted array as root
 * Step 2: Recursion for left & right sides
 * Step 3: Don't forget stopping recursion cases
 * 			1. When list size = 1, return the Node
 * 			2. When list size = 0, don't go recursion
 */

public class P1SortedArrayToBST {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(-2, 3, 4, 6, 7, 8, 12, 23, 90));
		
		BFS.traverse(solve(list));
	}
	
	
	public static TreeNode solve(ArrayList<Integer> list) {
		
		if(list.size()==1) //When list size = 1 just return the Node
			return new TreeNode(list.get(0));
		
	
		int mid = (list.size()-1)/2;
		//System.out.println("mid: "+list.get(mid));
		TreeNode element = new TreeNode(list.get(mid));
		
		ArrayList<Integer> left = new ArrayList<Integer>(list.subList(0, mid));
		//System.out.println("left array:"+left);
		ArrayList<Integer> right = new ArrayList<Integer>(list.subList(mid+1, list.size()));
		//System.out.println("right array:"+right);
		
		if(left.size()!=0) //I was doing mistake here. Forgot the case of list size = 0
			element.setLeft(solve(left));
		if(right.size()!=0)
			element.setRight(solve(right));
		
		return element;
		
	}
	
}
