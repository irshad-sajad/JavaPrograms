package com.company;

class Thread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("Thread1 is cooking food");
            System.out.println("But not focusing on making food only!");
            i++;
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("Thread2 is chatting");
            System.out.println("But not getting frequent replies!");
            i++;
        }
    }

}

public class cwh_70_threading {
    public static void main(String[] args){
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();
        th1.start();
        th2.start();
    }
}
