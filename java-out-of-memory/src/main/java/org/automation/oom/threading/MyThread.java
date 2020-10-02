package org.automation.oom.threading;

/**
 * @author sarker.shantonu@gmail.com
 * @created 10/2/2020
 */
public class MyThread extends Thread{

    private Thread thread = new Thread();
    @Override
    public void start()
    {
        super.start();
    }
    @Override
    public void run()
    {
        System.out.println("Thread is running ");
    }
}