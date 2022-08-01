package multithreading;


//Different object given
public class Sync2 {
	public static void main(String[] args) {
		Thread t1 = new Thread (new myTT1("Dhoni"));
		Thread t2 = new Thread (new myTT1("Yuvi"));
		t1.start();
		t2.start();
	}
}

class myTT1 implements Runnable{
	private String name;
	
	public myTT1(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
		disp(name);
	}
	
	public static synchronized void disp(String name) {
		for(int i=0; i<5; i++) {
			System.out.print(name+" ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}
}