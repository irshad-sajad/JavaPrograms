package com.company;

import java.util.Scanner;

class MaxRetriesExceededException extends Exception{
    @Override
    public String toString(){
        return "\nMaxRetriesExceededException: "+getMessage();
    }
    @Override
    public String getMessage(){
        return "You have exceeded the maximum limit of 5 attempts to access the array";
    }
}

public class cwh_86_ch14_ps {
    // problem-5
    public static void accessArray() throws MaxRetriesExceededException {
        // problem-3
        int[] arr = {2,4,5};
        int index;
        boolean flag = true;
        int i=0, max=5;
        while(flag && i != max){
            try {
                Scanner sc = new Scanner(System.in);
                index = sc.nextInt();
                System.out.println("the value of arr[index] is: "+ arr[index]);
                break;
            }
            catch (Exception e){
                System.out.println("invalid index");
                i++;
            }
        }
        if(i>=5){
            // problem-4
            try {
                throw new MaxRetriesExceededException();
            }
            catch (MaxRetriesExceededException e){
                System.out.println(e.toString());
            }
        }
    }

    public static void main(String[] args) {
        // problem-1
        // int a = 7 // syntax error
        int age = 22;
        int year_born = 2000-22; // logical error
        // System.out.println(5/0); // runtime error(exception)

        // problem-2
        try {
            System.out.println(7/0);
        }
        catch (ArithmeticException e){
            System.out.println("haha");
        }
        catch (IllegalArgumentException e){
            System.out.println("hehe");
        }

        // problem-5
        try {
            accessArray();
        }
        catch (MaxRetriesExceededException m){
            m.printStackTrace();
        }
    }
}
