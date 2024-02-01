package com.company;

public class cwh_33_varargs {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum2(int a, int b, int c){
//        return a+b+c;
//    }
//    static int sum3(int a, int b, int c, int d){
//        return a+b+c+d;
//    }
    static int sum(int ...arr){
        //available as int[] arr;
        int result=0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("the sum of 1 and 2 is: "+sum(1,2));
        System.out.println("the sum of 1,2 and 3 is: "+sum(1,2,3));
        System.out.println("the sum of 1,2,3 and 4 is: "+sum(1,2,3,4));
        System.out.println(sum(3,4,5,6,7,88,8));
    }
}
