package com.brainacad.lab2_17_10;

/**
 * Created by Alexander on 10/24/2016.
 */
public class MyThread extends Thread {

    MyObject myObjectHold;
    MyObject myObjectWait;

    public MyThread(String name, MyObject myObjectHold, MyObject myObjectWait) {
        this.myObjectHold = myObjectHold;
        this.myObjectWait = myObjectWait;
        this.setName(name);
    }

    @Override
    public void run(){

        synchronized (myObjectHold){
            System.out.println(this.getName() + " HOLDING " + myObjectHold.getNameOfThread());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + " WAITING " + myObjectWait.getNameOfThread());
            synchronized (myObjectWait){
            }
        }
    }
}
