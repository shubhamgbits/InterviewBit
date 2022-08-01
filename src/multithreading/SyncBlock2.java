package multithreading;


//Different object given
public class SyncBlock2 {
	public static void main(String[] args) {
		Thread t1 = new Thread (new myTT2("Dhoni"));
		Thread t2 = new Thread (new myTT2("Yuvi"));
		t1.start();
		t2.start();
	}
}

class myTT2 implements Runnable{
	private String name;
	static Object lock=new Object();
	public myTT2(String name) {
		this.name=name;
	}
	
	@Override
	public void run() {
		disp(name);
	}
	
	public void disp(String name) {
		synchronized (lock) {
			for(int i=0; i<5; i++) {
				System.out.print(name+" ");
				try { Thread.sleep(500); } catch (InterruptedException e) {}
			}
		}
		
	}
}