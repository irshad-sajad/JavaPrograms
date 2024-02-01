package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cwh_111_file_handling {
    public static void main(String[] args) {
        // create a new file
        /*
        File myFile = new File("cwh111file.txt");
        try {
            myFile.createNewFile();
        }
        catch(IOException e){
            System.out.println("unable to create this file");
            e.printStackTrace();
        }

        // write to a file
        try {
            FileWriter fileWriter = new FileWriter("cwh111file.txt");
            fileWriter.write("This is our first file from this Java Course");
            fileWriter.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        // reading a file
        File myFile = new File("cwh111file.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        */

        // deleting a file
        File myFile = new File("cwh111file.txt");
        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getName());
        } else{
            System.out.println("Some problem occurred while deleting the file");
        }
    }
}
