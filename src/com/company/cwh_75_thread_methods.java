package com.company;

class MyNewThread1 extends Thread{
    public void run(){
        int i=0;
        while(true){
            System.out.println("Thank you!");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyNewThread2 extends Thread{
    public void run(){
        while(true) System.out.println("My Thank you!");
    }
}

public class cwh_75_thread_methods {
    public static void main(String[] args) {
        MyNewThread1 t1 = new MyNewThread1();
        MyNewThread2 t2 = new MyNewThread2();
        t1.start();
        try {
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
