package trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class BFS {
	
	/*
	 * Remember 4 steps
	 * 1. Add root to queue
	 * 2. Start loop & pop the current value from queue
	 * 3. Print the current value
	 * 4. Add left & right Node to the queue
	 */
	
	public static void traverse(TreeNode root) {
		Queue<TreeNode> queue = new ArrayDeque<>();
		//Step 1:
		queue.add(root);
		
		while(!queue.isEmpty()) {
			//Step 2: Get current Node
			TreeNode current = queue.poll();
			
			//Step 3: Print the current Node
			System.out.print(current.getData()+" ");
			
			//Step 4: Add left & right Nodes to the queue
			if(current.getLeft()!=null)
				queue.add(current.getLeft());
			if(current.getRight()!=null)
				queue.add(current.getRight());	
		}
		
	}
	
}
