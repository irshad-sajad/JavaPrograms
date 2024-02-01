package com.company;

interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording video in 4k...");
    }
}
interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class MySmartPhone1 extends MyCellPhone implements Wifi, Camera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording a video");
    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Aman", "Harry", "Rohan"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+ network);
    }
    public void sampleMethod(){
        System.out.println("this is a sample method");
    }
}
public class cwh_59_polymorphism {
    public static void main(String[] args) {
        Camera cam = new MySmartPhone1(); // this is a smartphone but, use it as a camera
        // cam.getNetworks(); --> not allowed
        // cam.sampleMethod(); --> not allowed

        // can only use camera methods
        cam.record4KVideo();

        // can use all methods of smartphone
        MySmartPhone1 s = new MySmartPhone1();
        s.sampleMethod();
        s.recordVideo();
        s.getNetworks();
        s.callNumber(121);
    }
}
