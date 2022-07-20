package com.cg.Demo;

public class Yield extends Thread  
{  
    public void run()  
    {  
        for (int i=0; i<3 ; i++)  
            System.out.println(Thread.currentThread().getName() + " in control");  
    }  
    public static void main(String[]args)  
    {  
        Yield t1 = new Yield();  
        Yield t2 = new Yield();  
        // this will call run() method  
        t1.start();  
        t2.start();  
        for (int i=0; i<3; i++)  
        {  
            // Control passes to child thread  
            t1.yield();  
            System.out.println(Thread.currentThread().getName() + " in control");  
        }  
    }
}