package trees;

public class P5_CheckBST {
	/*
	 * left descendant <= root < right descendant
	 */
	
	
	/*
	 * If a BST do not contain duplicate. 
	 * 		-> We store the tree values in a array(in-order) & the resulting array is sorted by default. 
	 * 
	 * To make more sense of the question. Tree must have duplicates. 
	 */

	public static boolean check(TreeNode node) {
		
		return 
				
		checkBST(node.getLeft(), Integer.MIN_VALUE, node.getData(), 0) && 
		checkBST(node.getRight(), node.getData(), Integer.MAX_VALUE, 1); 
	}
	
	public static boolean checkBST(TreeNode node, int minValue, int maxValue, int side) {
		// side = 0 is left, side = 1 is right
		if(node == null)
			return true;
		
		if((side == 0 && node.getData()<=maxValue && node.getData()>minValue) ||
			(side == 1 && node.getData()<maxValue && node.getData()>minValue)) {
			
			return 
				checkBST(node.getLeft(), minValue, node.getData(), 0) && 
				checkBST(node.getRight(), node.getData(), maxValue, 1);
		}
		
		return false; 
	}

}
