package com.company;

public class cwh_24_break_and_continue {
    public static void main(String[] args) {
        //break and continue using loops!
        //using for loop
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//        }
//        System.out.println("Loop end here!");

        //using while loop
//        int i=0;
//        while (i < 5) {
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }
//        System.out.println("Loop end here!");

        //using do-while
//        int i=0;
//        do {
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }while(i<5);
//        System.out.println("Loop end here!");


        //continue
        for (int i = 0; i < 5; i++) {
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
        }
    }
}
