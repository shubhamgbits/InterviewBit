package LinkedList;

public class P_MainClass {
	public static void main(String[] args) {
		Node n1= new Node(10, null);
		Node n2= new Node(20, null);
		Node n3= new Node(30, null);
		Node n4= new Node(40, null);
		Node n5= new Node(50, null);
		Node n6= new Node(60, null);
		
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		
		//Node n = P2_DetectLoop.findLoop(n1);
		//P2_DetectLoop.floydCycle(n1);
		
		n1.printLL(P4_ReverseLL.reverse(n1));
		System.out.println(P3_PalindromeCheck.check(n1));
		
		
	}
}
