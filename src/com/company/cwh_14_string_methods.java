package com.company;

import java.util.Scanner;

public class cwh_14_string_methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "Harry";
//        System.out.println(name);

        //String Methods
//        int value = name.length();
//        System.out.println(value); //returns length of this string, in this case 5
//
//        String lstring = name.toLowerCase();
//        System.out.println(lstring); //returns a new string with all characters in lowercase
//
//        String ustring = name.toUpperCase();
//        System.out.println(name.toUpperCase()); //returns a new string with all characters in uppercase
//
//        String nonTrimmedString = "    Harry    ";
//        System.out.println(nonTrimmedString);
//        String trimmedString = nonTrimmedString.trim();
//        System.out.println(trimmedString);  //returns a new string after removing leading & trailing spaces from the original string.

//        System.out.println(name.substring(2)); //'rry'
//        System.out.println(name.substring(1,4)); //arr -> char at index 4 excluded. 1 included.
//
//        System.out.println(name.replace('r', 'p'));
//        System.out.println(name.replace("rry", "ier"));
//
//        System.out.println(name.startsWith("Har")); //true
//        System.out.println(name.endsWith("rry")); //true

//        System.out.println(name.charAt(0));
//        System.out.println(name.charAt(1));
//        System.out.println(name.charAt(2));
//        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(4));

//        String modifiedName = "Happyppy";
//        System.out.println(modifiedName.indexOf("ppy")); //2
//        System.out.println(modifiedName.indexOf("ppy",5)); //5
//        System.out.println(modifiedName.lastIndexOf("p")); //6
//        System.out.println(modifiedName.lastIndexOf("ppy", 7)); //5

//        System.out.println(name.equals("harry")); //false -> case sensitive
//        System.out.println(name.equalsIgnoreCase("harry")); //true

        //Escape Sequence Characters --> sequence of characters after backslash
        System.out.println("I am escape sequence \" double quote");
        System.out.println("I am escape sequence \n new line");
        System.out.println("I am escape sequence \t tab");
        System.out.println("I am escape sequence \\ double slash");
    }
}
