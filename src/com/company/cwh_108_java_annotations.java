package com.company;

// This is a functional interface as it contains a single abstract method.
@FunctionalInterface
interface myFunctionalInterface{
    void method1();
    // void method2(); // gives error if uncommented
}

class NewPhone extends Phone{
    @Override
    public void showTime(){
        System.out.println("Time is 10AM");
    }
    @Deprecated
    public int sum(int a,int b){
        return a+b;
    }
}

public class cwh_108_java_annotations {
    // annotations in java are used to provide extra info about a program.
    // annotations provides metadata(means info about some info) to class/methods.
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();
        phone.sum(2,3);
    }
}
