package com.company;

class Problem1a extends Thread{
    public void run(){
        while(true){
            System.out.println("good morning!");
        }
    }
}

class Problem1b extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }

            System.out.println("welcome!");
        }
    }
}

public class cwh_76_chapter13_ps {
    public static void main(String[] args) {
        Problem1a p1 = new Problem1a();
        Problem1b p2 = new Problem1b();

        // set priority
        p1.setPriority(6);
        p2.setPriority(9);
        // get priority
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        // get thread state
        //System.out.println(p1.getState());
        System.out.println(p2.getState());

        //p1.start();
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
