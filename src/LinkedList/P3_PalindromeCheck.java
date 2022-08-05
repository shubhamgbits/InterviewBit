package LinkedList;

import java.util.Stack;

public class P3_PalindromeCheck {
	
	//Approach by fast-slow runner 
	public static boolean check(Node head) {
		if(head.getNext()==null)
			return true;
		
		Node slow = head;
		Node fast = head;		
		//store values in a stack until fast reaches the end
		Stack<Integer> stack = new Stack<Integer>();
		
		while(fast!=null) {
			System.out.print("slow@ "+slow.getData());
			System.out.print(", fast@ "+fast.getData());
			stack.push(slow.getData());
			System.out.println(", Pushed "+stack.peek());
			
			if(fast.getNext()==null) 
				break;
			slow=slow.getNext();
			fast=fast.getNext().getNext();			
		}
		
		while(slow!=null) {
			
			if(slow.getData()==stack.pop()) {
				slow=slow.getNext();
				continue;
			}
			else
				return false;
		}
		return true;
	}
}
