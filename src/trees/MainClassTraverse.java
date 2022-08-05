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
	static Node a1, b1, b2, c1, c2, c3, d1, d2, d3, d4;
	
	
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
		a1 = new Node(50);
		b1 = new Node(45);
		b2 = new Node(68);
		c1 = new Node(46);
		c2 = new Node(43);
		c3 = new Node(62);
		d1 = new Node(6);
		d2 = new Node(49);
		d3 = new Node(65);
		d4 = new Node(71);
		
		a1.setLeft(b1); a1.setRight(b2);
		b1.setLeft(c1); b1.setRight(c2);
		b2.setRight(c3);
		c1.setLeft(d1);
		c2.setRight(d2);
		c3.setLeft(d3);
		c3.setRight(d4);
		
		//System.out.println("init done");
	}
}
