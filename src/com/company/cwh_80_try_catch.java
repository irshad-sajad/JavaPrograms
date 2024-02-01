package com.company;

public class cwh_80_try_catch {
    public static void main(String[] args) {
        int a = 500;
        int b = 0;
        // without try-catch
        // int c = a/b;
        // System.out.println("the result is: "+ c);

        // with try-catch
        try {
            int c = a/b;
            System.out.println("the result is: "+ c);
        }
        catch (Exception e){
            System.out.println("we failed to divide. reason:");
            System.out.println(e);
        }
        System.out.println("end of the program!");
    }
}
