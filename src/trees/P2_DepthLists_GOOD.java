package trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class P2_DepthLists_GOOD {
/*
 * Little different from normal BFS. In this approach we donot pop out Queue element. 
 * 
 * Step 1: Make queue of current level Nodes
 * Step 2: Make list of current level elements
 * Step 3: Traverse through the queue
 * Step 4: Store queue in a different queue(previous) & clear this current queue.
 * Step 5: Traverse through the stored (previous) queue & fill the list & current queue. 
 * Step 6: Loop continues till current queue does not get any element. 
 */
	public static void solve(TreeNode root){
		ArrayList<ArrayList<Integer>> allList = new ArrayList<ArrayList<Integer>>();
		
		Queue<TreeNode> currentNodes = new ArrayDeque<>();
		ArrayList<Integer> currentElements = new ArrayList<Integer>();
		
		currentNodes.add(root);
		currentElements.add(root.getData());
		
		while(!currentNodes.isEmpty()) {
			
			Queue<TreeNode> previousNodes = currentNodes;
			
			allList.add(currentElements);
			
			currentElements = new ArrayList<Integer>();
			currentNodes = new ArrayDeque<TreeNode>();
			
			for(TreeNode node: previousNodes) {
				if(node.getLeft()!=null) {
					currentNodes.add(node.getLeft());
					currentElements.add(node.getLeft().getData());
				}
				
				if(node.getRight()!=null) {
					currentNodes.add(node.getRight());
					currentElements.add(node.getRight().getData());
				}
			}			
		}
		
		System.out.println(allList);
	}
}
