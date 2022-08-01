package multithreading;

public class SyncBlock {
	public static void main(String[] args) {
		dispSB d = new dispSB();
		
		Thread t1 = new Thread (new myTsb(d, "Dhoni"));
		Thread t2 = new Thread (new myTsb(d, "Yuvi"));
		t1.start();
		t2.start();
		
	}
}

class myTsb implements Runnable{
	private String name;
	private dispSB obj;
	
	public myTsb(dispSB obj, String name) {
		this.name=name;
		this.obj = obj;
	}
	
	@Override
	public void run() {
		obj.wish(name);
	}	
}

class dispSB{
	public void wish(String name) {
		synchronized (this) {
			for(int i=0; i<5; i++) {
				System.out.print(name+" ");
				try { Thread.sleep(500); } catch (InterruptedException e) {	}
			}
		}			
	}
}