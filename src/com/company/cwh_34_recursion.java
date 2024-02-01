package com.company;

public class cwh_34_recursion {
    //recursion ---->>>>> function calling itself until base condition is not met...
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * fact(n-1);
        }
    }
    static int factIterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product=1;
            for(int i=1; i<=n; i++){
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int x = 5;
        System.out.println("the value of factorial of x is: "+fact(x));
        System.out.println("the value of factorial of x is: "+factIterative(x));
    }
}
