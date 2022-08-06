package trees;

import java.util.ArrayDeque;
import java.util.Queue;

/*
 * 						50	
 * 				    /        \
 * 				45				68
 * 			  /    \               \
 * 			46		43				62		
 * 		  /		       \          /    \
 * 		6				49		65		71
 *
 *
 *	BFS: 50 45 68 46 43 62 6 49 65 71
 *	DFS: 
 *		Pre-order:	50 45 46 6 43 49 68 62 65 71
 *		In-order:	6 46 45 43 49 50 68 65 62 71  
 *		Post-order:	6 46 49 43 45 65 71 62 68 50
 */


public class MainClassTraverse {
	static TreeNode a1, b1, b2, c1, c2, c3, d1, d2, d3, d4;
	
	
	public static void main(String[] args) {
		init();
		
		//BFS 
		System.out.print("BFS:  ");
		BFS.traverse(a1); System.out.println();
		
		//Pre-order
		System.out.print("Pre:  ");
		DFS.preOrder(a1); System.out.println();
		
		//In-order
		System.out.print("In:   ");
		DFS.inOrder(a1); System.out.println();
		
		//Post-order
		System.out.print("Post: ");
		DFS.postOrder(a1);
	}
	
	public static void init() {
		
		d4 = new TreeNode(71);
		d3 = new TreeNode(65);
		d2 = new TreeNode(49);
		d1 = new TreeNode(6);
		
		c3 = new TreeNode(62, d3, d4);
		c2 = new TreeNode(43, null, d2);
		c1 = new TreeNode(46, d1, null);
		
		b2 = new TreeNode(68, null, c3);
		b1 = new TreeNode(45, c1, c2);
		
		a1 = new TreeNode(50, b1, b2);
		
		
		
		
		//System.out.println("init done");
	}
}
