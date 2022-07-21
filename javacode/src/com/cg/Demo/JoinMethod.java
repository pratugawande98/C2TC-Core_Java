package com.cg.Demo;

public class JoinMethod extends Thread{
public void run() {
	for(int i=1;i<=5;i++)
	{
		try {
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}char[] i;
	System.out.println(i);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JoinMethod t1=new JoinMethod();
		JoinMethod t2=new JoinMethod();
		JoinMethod t3=new JoinMethod();
		t1.start();
		try {
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}

}
