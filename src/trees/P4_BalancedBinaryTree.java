package trees;

public class P4_BalancedBinaryTree {
	
	/*
	 * Traverse each node & compute height of its left & right subtree
	 */
	
	public static boolean check(TreeNode root) {
		if(root==null)
			return true;
		
		if(Math.abs(height(root.getLeft())-height(root.getRight()))>1)
			return false;
		else
			return check(root.getLeft()) && check(root.getRight());
	}
	
	public static int height(TreeNode node) {
		if(node==null)
			return 0;
		
		return Math.max(height(node.getLeft()), height(node.getRight()))+1;
	}
}
