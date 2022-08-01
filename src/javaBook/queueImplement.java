package javaBook;

public class queueImplement {
	public static void main(String[] args) {
		queue1 q = new queue1(5);
		q.printq();
		q.putvalue(5);
		q.printq();
		q.getValue();
		q.printq();
	}
}

class queue1{
	private int size, maxsize;
	private int putIndex; int getIndex;
	private int[] arr;
	public queue1(int size){
		this.size=0;
		this.maxsize=size;
		arr=new int[size];	
		
		putIndex=0;
		getIndex=0;
	}
	
	public int getValue() {
		if(size==0)
			System.out.println("queue empty");
		if(getIndex<maxsize) {
			size--;
			System.out.print("\nValue popped: "+arr[getIndex]);
			return arr[getIndex++];
			
		}
		else
			return -1;
	}
	
	public void putvalue(int val) {
		if(putIndex==maxsize-1)
			System.out.print("\nqueue is full");
		if(putIndex<maxsize) {
			arr[putIndex++]=val;
			size++;
		}
	}
	
	public void printq() {
		if(size==0)
			System.out.println("\nqueue empty");
		for(int i=getIndex;i<size;i++)
			System.out.print(arr[i]+" ");
	}
}