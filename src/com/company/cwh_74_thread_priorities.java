package com.company;

class MyThread1 extends Thread{
    public MyThread1(String name){
        super(name);
    }

    public void run(){
        while(true) {
            System.out.println("Thank you!" + this.getName());
        }
    }
}
public class cwh_74_thread_priorities {
    public static void main(String[] args) {
        // Ready Queue: T1 T2 T3 T4 T5
        MyThread1 t1 = new MyThread1("Harry1");
        MyThread1 t2 = new MyThread1("Harry2");
        MyThread1 t3 = new MyThread1("Harry3");
        MyThread1 t4 = new MyThread1("Harry4");
        MyThread1 t5 = new MyThread1("Harry5 (most important)");

        // set priority
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        // execute the run method
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
