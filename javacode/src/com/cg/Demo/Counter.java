package com.cg.Demo;

public class Counter {
	int count;
	public synchronized void inc()
	{
		count++;
	}
}
public class SynchronizationDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        Counter c=new Counter();
        Thread t1=new Thread(new Runnable()
        		{
        	public void run() {
        		for(int i=1;i<=10000;i++)
        		{
        			Counter c;
					c.inc();
        		}
        	}
        	});
        
        Thread t2=new Thread(new Runnable() {
         public void run1()
            {
	
               for(int i = 1;i<=10000;i++)
                {
	             Counter c;
                	c.inc();
                  }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();


}

}