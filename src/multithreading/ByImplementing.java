package multithreading;

public class ByImplementing {
	public static void main(String[] args) {
		Thread t1 = new Thread (new myThread2());
		t1.start();
		for(int i=11; i<20; i++)
			System.out.print(i+" ");
	}
}

class myThread2 implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<10; i++)
			System.out.print(i+" ");		
	}	
}
