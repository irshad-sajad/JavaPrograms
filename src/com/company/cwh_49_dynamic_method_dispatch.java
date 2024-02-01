package com.company;

class Phone{
    public void showTime(){
        System.out.println("Time is 12:30 pm");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}

public class cwh_49_dynamic_method_dispatch {
    public static void main(String[] args) {
        // Phone obj = new Phone(); // allowed
        // SmartPhone obj2 = new SmartPhone(); // allowed
        // obj.showTime();

        Phone obj = new SmartPhone(); // super ref -> sub obj is allowed
        // SmartPhone obj2 = new Phone(); // sub ref -> super obj is not allowed

        obj.showTime();
        obj.on(); // overridden method
        // obj.music(); // not allowed
    }
}
