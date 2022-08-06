package LinkedList;

public class P_MainClass {
	public static void main(String[] args) {
		Node A4= new Node(9, null);
		Node A3= new Node(9, A4);
		Node A2= new Node(9, A3);
		Node A1= new Node(9, A2);
		
		Node B7= new Node(9, null);
		Node B6= new Node(9, B7);
		Node B5= new Node(9, B6);
		Node B4= new Node(9, B5);
		Node B3= new Node(9, B4);
		Node B2 = new Node(9, B3);
		Node B1 = new Node(9, B2);
		
	
		
		Node result = P6_IntegerSum.solve(A1, B1);
		A1.printLL(result);
		
		
	}
}
