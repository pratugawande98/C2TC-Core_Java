package com.cg.Demo;

public class MyThread1 extends Thread {
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("CHILD");

		}
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			
		}
	
}
	public static class ThreadDemo   {

	


	public static void main(String[] args) throws InterruptedException{
		{
			MyThread1 m=new MyThread1();
			 m.start();
			 m.join();

			for(int i=0;i<10;i++)
			{
				System.out.println("MAIN");
			}
			
			}}
			

	}

}
