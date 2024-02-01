package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "I am toString()";
    }

    @Override
    public String getMessage(){
        return "I am getMessage";
    }
}

class MyAgeException extends Exception{
    @Override
    public String toString(){
        return "Age cannot be greater than 110";
    }

    @Override
    public String getMessage(){
        return "Make sure that the value of age entered is correct";
    }
}

public class cwh_83_exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        if(a<9){
            try {
                 // throw new MyException();
                throw new ArithmeticException("I am an exception");
            }
            catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println("finished!");
            }
            System.out.println("yes finished!");
        }
    }
}
