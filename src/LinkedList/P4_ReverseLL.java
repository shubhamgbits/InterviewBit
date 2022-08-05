package LinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class P4_ReverseLL {
	
	//M1: using ArrayList
	//M2: using recursion
	//M3: Iterative using 3 pointers
	public static Node reverse(Node head) {
		ArrayList<Integer> list = new ArrayList<>();
		
		Node current = head;
		
		while(current!=null) {
			list.add(head.getData());
			current = current.getNext();
		}
	
		current = head;
		int index=list.size()-1;
		while(current!=null) {
			current.setData(list.get(index));
			index--;
			current = current.getNext();
		}
		
		return head;
	}
	
	public static Node recursion(Node head) {
		
		if(head==null || head.getNext() ==null)
			return head;
		
		
		Node rest = recursion(head.getNext());
		
		
		return head;
	}
}
