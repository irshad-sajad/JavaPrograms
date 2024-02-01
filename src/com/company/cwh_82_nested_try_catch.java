package com.company;

import java.util.Scanner;

public class cwh_82_nested_try_catch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 43;
        marks[1] = 53;
        marks[2] = 86;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("enter the value of index: ");
            int index = sc.nextInt();
            try {
                System.out.println("welcome to video no 82");
                try {
                    System.out.format("the value at index %d is %d\n", index, marks[index]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("sorry this index does not exist!");
                    System.out.println("exception in level 2");
                }
            }
            catch (Exception e){
                System.out.println("exception in level 1");
            }
        }
        System.out.println("thanks for using our program");
    }
}
