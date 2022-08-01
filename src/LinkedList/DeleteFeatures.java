package LinkedList;

public class DeleteFeatures {
	
	public static void main(String[] args) {
		DeleteFeatures b1= new DeleteFeatures();
		Node n1= new Node(10, null);
		Node n2= new Node(20, null);
		Node n3= new Node(30, null);
		Node n4= new Node(40, null);
		
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		
		b1.printLL(n1);
		
//		Node nn=b1.deleteFirst(n1);
//		System.out.println("\nAfter Delete Operation: ");
//		b1.printLL(nn);
		
//		b1.deleteLast(n1);
//		System.out.println("\nAfter Delete Last Operation: ");
//		b1.printLL(n1);
		
		b1.deleteInBetween(4, n1, b1.getLength(n1));
		System.out.println("\nAfter Delete In Between Operation: ");
		b1.printLL(n1);
	}
	
	public int getLength(Node head) {
		int len=0;
		while(head!=null) {
			head=head.getNext();
			len++;
		}
		return len;
	}
	public void printLL(Node head) {
		while(head!=null) {
			System.out.print(head.getData());
			if(head.getNext()!=null)
				System.out.print(" → ");
			head=head.getNext();
		}
	}
	
	public Node deleteFirst(Node head) {
		return head.getNext();
	}
	
	public void deleteLast(Node head) {
		Node previous=head;
		Node next=head.getNext();
		while(next.getNext()!=null) {
			previous=previous.getNext();
			next=next.getNext();
		}
		previous.setNext(null);
	}
	
	public boolean deleteInBetween(int pos, Node head, int length) {
		if(pos<1 || pos>length) {
			System.out.println("\noperation invalid");
			return false;
		}
		else {
			if(pos==1) {
				
			}
			
			else {
				Node previous=head;
				Node next=head.getNext();
				int index=pos-2; //2
				while(index!=0) {
					previous=previous.getNext();
					next=next.getNext();
					index--;
				}
				previous.setNext(next.getNext());
			}
			
		}
		return true;
	}

}
