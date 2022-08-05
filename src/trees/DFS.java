package trees;

public class DFS {

	public static void preOrder(Node node) {
		if(node!=null) {
			
			System.out.print(node.getData()+" ");
			
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}
	
	public static void inOrder(Node node) {
		if(node!=null) {
			
			inOrder(node.getLeft());
			
			System.out.print(node.getData()+" ");
			
			inOrder(node.getRight());
		}
	}
	
	public static void postOrder(Node node) {
		if(node!=null) {
			
			postOrder(node.getLeft());			
			postOrder(node.getRight());
			
			System.out.print(node.getData()+" ");
		}
	}
}
