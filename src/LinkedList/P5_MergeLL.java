package LinkedList;

public class P5_MergeLL {
	
	//Without extra space 
	public static Node merge(Node head1, Node head2) {
				
		Node root = head1.getData()<head2.getData()?head1:head2;
		Node previous=root;
		
/*
 * 	This is the case if second list has smaller nodes initially.We traverse it till its bigger node comes. 
 * 	Since by default we make head1 as our final list. 
 */
		if(head2.getData()<=head1.getData()) {
			while(head1!=null && head2!=null && head2.getData()<=head1.getData()) {
				previous=head2;
				head2=head2.getNext();			
			}
			previous.setNext(head1);
		}		
/*
 * This loop works only when head2 1st node is smaller than head1 1st Node
 */
		while(head1!=null && head2!=null) {
//			System.out.println("Previous@ "+previous.getData());
//			System.out.println("head1@ "+head1.getData());
//			System.out.println("head2@ "+head2.getData());
			
			if(head1.getData()<head2.getData()) {
				previous=head1;
				head1=head1.getNext();
			}
			
			else {				
				Node nextNodeofLL2 = head2.getNext();
				
				previous.setNext(head2);
				head2.setNext(head1);
				previous=head2;
				
				head2 = nextNodeofLL2;				
			}			
		}

/*
 * Case when our head1 list contains less elements.
 */
		if(head1==null && head2!=null) {
			previous.setNext(head2);
		}
		
		return root; 
	}
}
