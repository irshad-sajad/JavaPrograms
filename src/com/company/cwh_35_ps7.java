package com.company;

public class cwh_35_ps7 {
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d x %d = %d\n",n,i,n*i);
        }
    }
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static int sumRec(int n){
        //base condition
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static int fibonacci(int n){
        /* if(n==1) return 0;
        else if(n==2) return 1; */
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    static int average(int ...arr){
        int sum = 2+3+4+5+6;
        return sum/arr.length;
    }
    static float tempConvert(float n){
        return (n*9/5)+32;
    }
    static int sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        //problem-1
        //multiplication(7);

        //problem-2
        //pattern(4);

        //problem-3
        //int res = sumRec(100);
        //System.out.println(res);

        //problem-4
        //pattern1(4);

        //problem-5
        //int res = fibonacci(5);
        //System.out.println(res);

        //problem-6
        //int res = average(2,3,4,5,6);
        //System.out.println("the average of these numbers is: "+res);

        //problem-9
        //float res = tempConvert(0);
        //System.out.println(res);

        //problem-10
        int res = sum(10);
        System.out.println("the sum is: "+res);
    }
}
