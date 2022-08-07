package trees;

/*
 * 						40	
 * 				    /        \
 * 				35				45
 * 			  /    \           /    \
 * 			30		37		  41	48		
 * 		  /		               
 * 		20					
 *
 */

public class MainBST {
	static TreeNode a1, b1, b2, c1, c2, c3, c4, d1, d2, d3, d4, e1;
	
	public static void main(String[] args) {
		init();
		
		System.out.println(P5_CheckBST.check(a1));
		
	}
	
	public static void init() {
//		e1 = new TreeNode(5);
//		
//		d4 = new TreeNode(71);
//		d3 = new TreeNode(65, null, e1);
//		d2 = new TreeNode(49);
		d1 = new TreeNode(20);
		
		c4 = new TreeNode(48);
		c3 = new TreeNode(41);
		c2 = new TreeNode(37);
		c1 = new TreeNode(30, d1, null);
		
		b2 = new TreeNode(45, c3, c4);
		b1 = new TreeNode(35, c1, c2);
		
		a1 = new TreeNode(40, b1, b2);
		
		
		
		
		//System.out.println("init done");
	}
}
