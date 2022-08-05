package LinkedList;

import java.util.HashMap;

public class P1_RemoveDuplicates {

	public static void main(String[] args) {
		Node n1= new Node(10, null);
		Node n2= new Node(20, null);
		Node n3= new Node(30, null);
		Node n4= new Node(40, null);
		Node n5= new Node(70, null);
		Node nd1= new Node(30, null);
		Node nd2=new Node(20, null);
		Node nd3= new Node(10, null);
		
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(nd1);
		nd1.setNext(n4);
		n4.setNext(nd2);
		nd2.setNext(nd3);
		nd3.setNext(n5);
		n1.printLL(n1);
		
		System.out.println("\nAfter removing duplicates");
		P1_RemoveDuplicates rd=new P1_RemoveDuplicates();
		rd.removeDup(n1);
		n1.printLL(n1);
		
	}
	
	public void removeDup(Node head) {
		Node previous=head;
		Node next=head.getNext();
		HashMap<Integer, Integer> mp=new HashMap<Integer, Integer>();
		mp.put(previous.getData(), 1);
		while(next!=null) {
			if(mp.get(next.getData())==null) {
				mp.put(next.getData(), 1);
				previous=previous.getNext();
				next=next.getNext();
			}
			else if(mp.get(next.getData())!=null){
				previous.setNext(next.getNext());
				next=next.getNext();
			}			
		}
	}
}
