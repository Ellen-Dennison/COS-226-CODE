import java.io.*;
import java.util.*;
import java.lang.Thread;
import java.util.Random;

// Thread class implementation
class myThread extends Thread
{  
    @Override
    public void run()
    {    
        // name for throwing the exception
        try 
        {  
            int randomNum = 5 + (int)(Math.random() * ((52 - 5) + 1)); 
            Thread.currentThread().sleep(randomNum);
            System.out.println( "RandomNumber " + randomNum); 
            System.out.println( "Current Thread Name: " + Thread.currentThread().getName()); 
        }
        catch (Exception e) 
        {
            // catching the exception
            System.out.println(e);
        }
    }
}


public class u23849259 extends Thread
{
    
    public static void main(String[] args)
    {   

        myThread t1[] = new myThread[5];
        for (int j = 0; j < 5; j++) 
        {
            t1[j] = new myThread();
            t1[j].start();
        }
        for (int j = 0; j < 5; j++) 
        {    
            /* Join is waiting for all the threads to finish */
            try
            { t1[j].join(); }
            catch (InterruptedException e) 
            {
                // catching the exception
                System.out.println(e);
            }
        }

    }
}

/* 
Create a program that creates 5 threads (A -E). 
Each thread, once started, must sleep for a random period of time between 5 to 51 ms 
after which it prints its identity
*/
