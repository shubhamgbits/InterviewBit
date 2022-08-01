package multithreading;

public class XSequencePrintPractice {
	public static void main(String[] args) {
		Thread my1 = new Thread(new myThreadd(1),"T1");
		Thread my2 = new Thread(new myThreadd(2),"T2");
		Thread my3 = new Thread(new myThreadd(3),"T3");
		Thread my4 = new Thread(new myThreadd(0),"T4");
		
		my3.start();
		my2.start();
		my1.start();
		my4.start();
	}
}


class myThreadd implements Runnable{

	static Object lock = myThreadd.class;
	int remainder;
	static int num=1;
	int noThreads = 4;
	
	myThreadd(int r){
		remainder =r;
	}
	
	@Override
	public void run() {
		
		while(num < 100) {
			synchronized (lock) {
				while(num%noThreads!=remainder) {
					//System.out.println(Thread.currentThread().getName());	
					try {
							lock.wait();
						} catch (Exception e) {
						// TODO: handle exception
						}	
				}
				System.out.println(Thread.currentThread().getName()+" "+num);
				num++;
				lock.notifyAll();					
			}
		}
	}
}