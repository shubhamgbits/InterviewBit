package trees;

public class P3_CheckSubtree {

/*
 * Step 1: Make one method which will compare two trees
 * Step 2: Make another method which will check in recursion if trees don't match. 
 * 
 * Logic of choosing OR on line 21: 
 * 		- return true if it is subtree on either side. 
 */
	public static boolean check(TreeNode tree1, TreeNode tree2) {
		if(tree1==null)
			return false;
		
		if(!matchTree(tree1, tree2)) {
			return check(tree1.getLeft(), tree2) || check(tree1.getRight(), tree2);
		}
		//if matchTree returns 1 then tree2 is a subtree
		return true;
	}
	
	public static boolean matchTree(TreeNode a, TreeNode b) {
		
		if(a==null && b==null)
			return true;
		if(a==null || b==null)
			return false;
		
		if(a.getData()==b.getData() && a.getLeft()==b.getLeft() && a.getRight()==b.getRight())
			return true;
		return false;
	}
}
