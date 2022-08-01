package multithreading;


//same object given to both strings
public class Sync {
	public static void main(String[] args) {
		display d = new display();
		
		Thread t1 = new Thread (new myT1(d, "Dhoni"));
		Thread t2 = new Thread (new myT1(d, "Yuvi"));
		t1.start();
		t2.start();
		
	}
}
class myT1 implements Runnable{
	private String name;
	private display obj;
	
	public myT1(display obj, String name) {
		this.name=name;
		this.obj = obj;
	}
	
	@Override
	public void run() {
		obj.wish(name);
	}	
}

class display{
	public synchronized void wish(String name) {
		for(int i=0; i<5; i++) {
			System.out.print(name+" ");
			
			try { Thread.sleep(500); } catch (InterruptedException e) {	}
		}
			
	}
}

