package multithreading;

public class ByExtending {
	public static void main(String[] args) {
		myThread t1 = new myThread();
		t1.start();	//Creates new thread. run() called automatically
	}
}

class myThread extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<10; i++)
			System.out.print(i+" ");
	}
}

