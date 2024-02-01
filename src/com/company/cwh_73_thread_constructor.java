package com.company;

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }

    public void run(){
        System.out.println("thread is running ...");
    }
}

class MyThread2 implements Runnable{
//    public MyThread2(String name){
//        super();
//    }

    public void run(){
        System.out.println("Now the thread is running ...");
    }
}

public class cwh_73_thread_constructor {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Aman");
        MyThread t2 = new MyThread("Akash");
        t1.start();
        t2.start();
        System.out.println("the id of thread t1 is: "+ t1.threadId());
        System.out.println("the name of thread t1 is: "+ t1.getName());
        System.out.println("the id of thread t2 is: "+ t2.threadId());
        System.out.println("the name of thread t2 is: "+ t2.getName());

        // creating an object of class MyThread2
        Runnable r  = new MyThread2();

        // creating an object of the class Thread using Thread(Runnable r, String name)
        Thread t = new Thread(r, "My new thread");

        // the start() method moves the thread to the active state
        t.start();

        // getting the thread id and thread name by invoking the getName() method
        System.out.println("the id of thread gun1 is: "+ t.threadId());
        System.out.println("the name of thread gun1 is: "+ t.getName());
    }
}
