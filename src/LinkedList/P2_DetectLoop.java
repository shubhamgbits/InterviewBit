package LinkedList;

import java.util.HashSet;

public class P2_DetectLoop {

	
	//M1: Iterative using HashSet(Use O(n) extra space)
	public static Node findLoop(Node head) {
		HashSet<Node> set = new HashSet<Node>();
		
		set.add(head);
		
		Node current = head;
		
		while(current!=null) {
			if(set.contains(current.getNext())) {
				return current;
			}
			
			set.add(current.getNext());
			current = current.getNext();
		}		
		return null;
	}
	
	//M2: Fast & slow runner approach (without Hashset - constant space) - FLOYD CYCLE
	public static void floydCycle(Node head) {
		if(head.getNext()==null)
			System.out.println("No Loop detected");
		
		Node slow = head.getNext();
		Node fast = head.getNext().getNext();
		
		while(slow!=fast) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		
		System.out.println("slow & fast meet @"+slow.getData());
		slow = head;
		
		while(fast!=slow) {
			fast = fast.getNext();
			slow = slow.getNext();
		}
		if(slow==null)
			System.out.println("No loop detected");
		System.out.println("Loop detected @"+slow.getData());
	}
	
	
	
}
