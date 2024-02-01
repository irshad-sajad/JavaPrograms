package com.company;

public class cwh_29_ps6 {
    public static void main(String[] args) {
        //Q1:
        /*
        float[] arr = {2.3f,4.5f,2.2f,5.6f,6.6f};
        float sum = 0;
        for(float element: arr){
            sum = sum+element;
        }
        System.out.println("sum is: "+sum);
        */

        //Q2:
        /*
        int[] arr = {1,2,3,4,5};
        int num = 9;
        boolean isInArray = false;
        for(int element: arr){
            if (num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("the value is present in the array");
        }else{
            System.out.println("the value is not present in the array");
        }
        */

        //Q3:
        /*
        float[] marks = {55,66,77,88,99};
        float sum = 0;
        for(float element: marks){
            sum = sum + element;
        }
        System.out.println("the value of average marks is: "+ sum/marks.length);
        */

        //Q4:
        /*
        int[][] mat1 = {
                {1,2,3},
                {4,5,6}
        };
        int[][] mat2 = {
                {1,2,3},
                {4,5,6}
        };
        int[][] result = {
                {0,0,0},
                {0,0,0}
        };
        for(int i=0;i<mat1.length;i++){ //row number of times
            for(int j=0;j<mat1[i].length;j++) { //column number of times

                result[i][j] = mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        */

        //Q5:
        /*
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length/2;
        int l = arr.length;
        int temp;
        for(int i=0; i<n; i++){
            //swap -> arr[i] and arr[l-i-1]
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element: arr){
            System.out.print(element+" ");
        }
        */

        //Q6:
//        int[] arr = {2,5,4,3,1};
//        // int max = 0;
//        int max = Integer.MIN_VALUE;
//        for(int element:arr){
//            if(element>max){
//                max = element;
//            }
//        }
//        System.out.println("max element in this array is: "+max);

        //Q7:
//        int[] arr = {3,6,1,5,8};
//        int min = Integer.MAX_VALUE;
//        for(int element: arr){
//            if(element<min){
//                min = element;
//            }
//        }
//        System.out.println("the min value in this array is: "+min);

        //Q8:
        int[] arr = {2,4,6,1,10};
        boolean isSorted = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("the array is sorted");
        }else{
            System.out.println("the array is not sorted");
        }
    }
}
