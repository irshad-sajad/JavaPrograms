package com.company;

@FunctionalInterface
interface DemoAno{
    void meth1(int a);
    //void meth2();
}

//class myFunc implements DemoAno{
//    @Override
//    public void meth1() {
//        System.out.println("I am method 1");
//    }
//}

//class AnonyDemo implements DemoAno{
//    public void display(){
//        System.out.println("hello");
//    }
//
//    @Override
//    public void meth1(){
//        System.out.println("I am meth1() of interface, and here I have been overridden by Anonymous class");
//    }

//    @Override
//    public void meth2(){
//        System.out.println("I am meth1 of interface, and here I have been overridden by Anonymous class");
//    }
//}

public class cwh_109_lambda_expressions {
    public static void main(String[] args) {
        // DemoAno obj = new AnonyDemo();
        // obj.meth1();

        // Anonymous Class
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("I am meth1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("I am meth2");
//            }
//        };
//        obj.meth1();
//        obj.meth2();


        // Lambda Expressions
//        DemoAno obj = new myFunc();
//        obj.meth1();
        DemoAno obj = (a) -> {
            System.out.println("I am method 1 of lambda expression" + a);
        };
        obj.meth1(7);
    }
}
