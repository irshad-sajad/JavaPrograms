package com.company;

interface Bicycle{
    int a = 23;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface RingBicycle{
    void ring1();
    void ring2();
}
class AvonCycle implements Bicycle, RingBicycle{
    int speed = 50;
    public void applyBrake(int decrement){
        speed = speed - decrement;
        System.out.format("after applying brake, the speed is: %d", speed);
    }
    public void speedUp(int increment){
        speed = speed - increment;
        System.out.format("after applying accelerator, the speed is: %d", speed);
    }

    public void ring1(){
        System.out.println("Mai hu naa.. tee tee tee");
    }
    public void ring2(){
        System.out.println("Dhoom Machale.. dee dee dee");
    }
}

public class cwh_54_interfaces {
    public static void main(String[] args) {
        //Bicycle bicycle = new Bicycle(); --> error
        AvonCycle avon = new AvonCycle();
        avon.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(avon.a);

        // You cannot modify properties in Interfaces as they are final
        //avon.a = 60; --> not allowed(error)
        //System.out.println(avon.a);

        avon.ring1();
        avon.ring2();
    }
}
