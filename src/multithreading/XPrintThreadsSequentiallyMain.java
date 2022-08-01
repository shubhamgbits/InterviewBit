package multithreading;

public class XPrintThreadsSequentiallyMain {
	public static void main(String[] args) {
		 
        PrintSequenceRunnable runnable1=new PrintSequenceRunnable(1);
        PrintSequenceRunnable runnable2=new PrintSequenceRunnable(0);
        //PrintSequenceRunnable runnable3=new PrintSequenceRunnable(0);
 
        Thread t1=new Thread(runnable1,"T1");
        Thread t2=new Thread(runnable2,"T2");
        //Thread t3=new Thread(runnable3,"T3");
        t2.start();
        t1.start();
        
        //t3.start();  
    }
}


class PrintSequenceRunnable implements Runnable{
	 
    public int PRINT_NUMBERS_UPTO=10;
    static int  number=1;
    int remainder;
    static Object lock=PrintSequenceRunnable.class; //kind of class lock. 'static' is used so only one copy is created for all objects. 
 
    PrintSequenceRunnable(int remainder)
    {
        this.remainder=remainder;
    }
 
    @Override
    public void run() {
        while (number < PRINT_NUMBERS_UPTO) {
            synchronized (lock) {
            	System.out.println(Thread.currentThread().getName()+" starts");
            	while (number % 2 != remainder) { // wait for numbers other than remainder
                    try {
                    	System.out.println(Thread.currentThread().getName()+" pause");
                        lock.wait();
                        //Thread.sleep(2000);
                        System.out.println(Thread.currentThread().getName()+" resume");
                    } 
                    catch (InterruptedException e) { e.printStackTrace(); }
                }
                System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
                lock.notifyAll();
            }
        }
    }
}