package com.company;

public class cwh_107_method_tags {
    /**
     * This is a main method of the class cwh_107_method_tags
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     * This is a user defined method of the class cwh_107_method_tags
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return Sum of two numbers as an integer
     * @throws Exception if i is 0(zero)
     * @deprecated This method is deprecated please use plus(+) operator
     */

    public int add(int i,int j) throws Exception{
        if(i==0){
            throw new Exception();
        }
        int k;
        k = i+j;
        return k;
    }
}
