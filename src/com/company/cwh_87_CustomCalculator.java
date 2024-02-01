package com.company;

import java.util.Scanner;

class InvalidInputException extends Exception{
    @Override
    public String toString(){
        return "cannot add 8 & 9";
    }
    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}

class CannotDivideByZeroException extends Exception{
    @Override
    public String toString(){
        return "cannot divide by 0";
    }
    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}

class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "your inputs cannot be greater than 100000";
    }
    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}

class MaxMultiplierReachedException extends Exception{
    @Override
    public String toString(){
        return "your inputs cannot be greater than 7000 while multiplying";
    }
    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}



class CustomCalculator{
    public double add(double a, double b) throws MaxInputException, InvalidInputException {
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        else if(a==8 || b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }
    public double subtract(double a, double b) throws MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a-b;
    }
    public double multiply(double a, double b) throws MaxInputException, MaxMultiplierReachedException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        else if(a>7000 || b>7000){
            throw new MaxMultiplierReachedException();
        }
        return a*b;
    }
    public double divide(double a, double b) throws InvalidInputException, CannotDivideByZeroException{
        if(a>100000 || b>100000){
            throw new InvalidInputException();
        }
        else if(b == 0){
            throw new CannotDivideByZeroException();
        }
        return a/b;
    }
}

public class cwh_87_CustomCalculator {
    public static void main(String[] args) throws MaxInputException, InvalidInputException, MaxMultiplierReachedException, CannotDivideByZeroException {
        CustomCalculator c = new CustomCalculator();
        // c.add(8,9);
        // c.multiply(2323,34343);
         c.divide(56,0);
    }
}

/*
Exercise 6: You have to create a custom calculator with following operations:
1. + -> Addition
2. - -> Subtraction
3. * -> Multiplication
4. / -> Division
which throws the following exceptions:
1. Invalid input Exception ex: 8 & 9
2. Cannot divide by 0 Exception
3. Max Input Exception if any of the inputs is greater than 100000
4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
*/