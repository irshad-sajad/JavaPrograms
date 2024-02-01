package com.company;

//problem-1
abstract class Pen{
    abstract void write();
    abstract void refill();
}

//problem-2
class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("changing the nib of this pen");
    }
}

//problem-3
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir");
    }
    @Override
    public void eat(){
        System.out.println("Eating...");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping...");
    }
}

//problem-4
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone{
    void playMusic(){
        System.out.println("Playing Music...");
    }
    @Override
    public void ring(){
        System.out.println("Ringing...");
    }
    @Override
    void lift(){
        System.out.println("Lift the phone");
    }
    @Override
    void disconnect(){
        System.out.println("Disconnect the call");
    }
}

//problem-6
interface TVRemote{
    void powerOn();
    void volume();
}

interface SmartTVRemote extends TVRemote{
    void channel();
    void play();
}

//problem-7
class TV implements TVRemote{
    public void powerOn(){
        System.out.println("Turn on the TV");
    }
    public void volume(){
        System.out.println("Increase or decrease the volume");
    }
}

public class cwh_60_ch11_ps {
    public static void main(String[] args) {
        //problem-1,2
        FountainPen pen = new FountainPen();
        pen.changeNib();

        //problem-3
        Human h = new Human();
        h.sleep();

        //problem-5
        Monkey m = new Human();
        m.jump();
        m.bite();
        // m.speak(); --> cannot use speak method bcz the reference is monkey which does not have speak method

        BasicAnimal basic = new Human();
        // basic.speak(); --> error
        basic.eat();
        basic.sleep();

        //problem-4
        Telephone phone = new SmartTelephone();
        phone.ring();
        phone.lift();
        phone.disconnect();
        // tp.playMusic(); --> cannot use playMusic method bcz the reference is telephone which does not have playMusic method

        SmartTelephone s = new SmartTelephone();
        s.playMusic();

        //problem-6
        TV obj = new TV();
        obj.powerOn();
        obj.volume();
    }
}
