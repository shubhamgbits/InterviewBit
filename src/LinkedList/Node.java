package LinkedList;

public class Node {
		private int data;
		private Node next;
		
		public Node(int d, Node n) {
			this.data=d;
			this.next=n;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
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
}
