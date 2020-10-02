package org.automation.oom.threading;

/**
 * @author sarker.shantonu@gmail.com
 * @created 10/2/2020
 */
public class MyRunnable implements Runnable{
    private Thread thread;

    public MyRunnable(){
        thread = new Thread(this, "Runnable thread");
        thread.start();
        System.out.println("my thread started");

    }
    @Override
    public void run() {
        System.out.println("my thread is running ");

    }

}
