package LinkedList;

public class P5_MergeLL {
	
	//Without extra space 
	public Node merge(Node head1, Node head2) {

		
		while(head1.getNext()!=null || head2.getNext()!=null) {
			
			if(head1.getData()<=head2.getData()) {
				head1=head1.getNext();
			}
			
			else {
				Node temp = head1.getNext();
				head1.setNext(head2);
				
				head2 = head2.getNext();
				head1.getNext().setNext(temp);
			}
			head1
		}
		
		return head1; 
	}
}
