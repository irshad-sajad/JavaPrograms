package com.company;

import java.util.Scanner;

public class cwh_81_handling_exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = {34,67,78};
        System.out.println("enter the array index: ");
        int index = sc.nextInt();

        System.out.println("enter the number you want to divide the value with: ");
        int num = sc.nextInt();

        try {
            System.out.println("the value at array index entered is: "+ marks[index]);
            System.out.println("the value of array-value/number is: "+ marks[index]/num);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException occured!");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("some other exception has occured!");
            System.out.println(e);
        }

    }
}
