package LinkedList;

public class P6_IntegerSum {
	
	
	
	public static Node solveBetter(Node num1, Node num2) {
		
		if(num1==null)
			return num2;
		if(num2==null)
			return num1;
		
		num1 = P4_ReverseLL.reverseWithoutSpace(num1);
		num2 = P4_ReverseLL.reverseWithoutSpace(num2);
		
		Node sumLL = new Node(-1, null);
		Node current = sumLL;
		int carry = 0;
		int rem = 0;
		
		while(!(num1==null && num2==null)) {
			
			int sum = 0;
			
			if(num1!=null) sum = sum + num1.getData();
			if(num2!=null) sum = sum + num2.getData();
			
			rem= (carry + sum)%10;
			carry = (carry+sum)/10;
			
			System.out.println("rem: "+rem+" carry: "+carry);
			
			Node ans = new Node(rem, null);
			current.setNext(ans);	
			current = current.getNext();
			
			if(num1!=null) num1=num1.getNext();
			if(num2!=null) num2=num2.getNext();
		}
		
		if(carry!=0) {
			Node newNode = new Node(carry, null);
			current.setNext(newNode);
		}
		return P4_ReverseLL.reverseWithoutSpace(sumLL.getNext());
	}
	
	
	public static Node solve(Node num1, Node num2) {
		
		if(num1==null)
			return num2;
		if(num2==null)
			return num1;
		
		num1 = P4_ReverseLL.reverseWithoutSpace(num1);
		num2 = P4_ReverseLL.reverseWithoutSpace(num2);
		
		Node sumLL = new Node(-1, null);
		Node current = sumLL;
		int carry = 0;
		int rem = 0;
		
		while(num1!=null && num2!=null) {
			
			int sum = num1.getData() + num2.getData();
			rem= (carry + sum)%10;
			carry = (carry+sum)/10;
			
			System.out.println("rem: "+rem+" carry: "+carry);
			
			Node ans = new Node(rem, null);
			current.setNext(ans);	
			current = current.getNext();
			
			num1=num1.getNext();
			num2=num2.getNext();
		}
		
		if(num1==null && num2!=null) {
			
			current.setNext(num2);
			while(carry!=0 && num2!=null) {
				if(current.getNext()!=null)
					current = current.getNext();
				
				rem = (carry+num2.getData())%10;
				carry = (carry+num2.getData())/10;
				num2.setData(rem);
				num2 = num2.getNext();
			}
			if(carry!=0) {
				Node newNode = new Node(carry, null);
				current.setNext(newNode);
			}
		}
		
		if(num2==null && num1!=null) {
			
			current.setNext(num1);
			while(carry!=0 && num1!=null) {
				if(current.getNext()!=null)
					current = current.getNext();
				
				rem = (carry+num1.getData())%10;
				carry = (carry+num1.getData())/10;
				num1.setData(rem);
				num1 = num1.getNext();
			}
			if(carry!=0) {
				Node newNode = new Node(carry, null);
				current.setNext(newNode);
			}
		}
		
		return P4_ReverseLL.reverseWithoutSpace(sumLL.getNext());
	}

}
