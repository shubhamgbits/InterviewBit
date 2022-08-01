package LinkedList;

public class InsertFeatures {
	
	public static void main(String[] args) {
		
		InsertFeatures b1= new InsertFeatures();
		Node n1= new Node(10, null);
		Node n2= new Node(20, null);
		Node n3= new Node(30, null);
		Node n4= new Node(40, null);
		
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		
		n1.printLL(n1);
		
//		System.out.print("\nInsert First Operation: ");
//		Node head = b1.setFirst(5, n1);
//		b1.printLL(head);
		
//		System.out.print("\nInsert Last Operation: ");
//		b1.setLast(45, n1);
//		b1.printLL(n1);
//		System.out.println("\n"+b1.getLength(n1));
		
		int pos=5;
		System.out.print("\nInsert In-Between Operation: ");
		boolean ops = b1.setInBetween(-10, n1, pos, n1.getLength(n1));
		if(pos!=1 && ops) n1.printLL(n1);
	}
	
	
//	public int getLength(Node head) {
//		int len=0;
//		while(head!=null) {
//			head=head.getNext();
//			len++;
//		}
//		return len;
//	}
//	public void printLL(Node head) {
//		while(head!=null) {
//			System.out.print(head.getData());
//			if(head.getNext()!=null)
//				System.out.print(" → ");
//			head=head.getNext();
//		}
//	}
	
	public Node setFirst(int value, Node head) {
		
		Node nn=new Node(value, null);
		nn.setNext(head);
		
		return nn;
	}
	
	public void setLast(int value, Node head) {
		
		Node nn=new Node(value, null);
		while(head.getNext()!=null) {
			head=head.getNext();
		}
		head.setNext(nn);
	}
	
	public boolean setInBetween(int value, Node head, int pos, int length) {
		
		if(pos>length+1 || pos<1) {
			System.out.println("operation invalid");
			return false;
		}
		
		else if (pos==1) {
			InsertFeatures newb=new InsertFeatures();
			Node nk = newb.setFirst(value, head);
			nk.printLL(nk);
			return true;
		}
		
		else if(pos==length+1) {
			InsertFeatures newb=new InsertFeatures();
			newb.setLast(value, head);
			return true;
		}
		
		else {
			int index=pos-2;
			Node nn=new Node(value, null);
			Node previous=head;
			Node next=head.getNext();
			
			while(index!=0) {
				previous=previous.getNext();
				next=next.getNext();
				index--;
			}
			previous.setNext(nn);
			nn.setNext(next);
			return true;
		}
	}
}

