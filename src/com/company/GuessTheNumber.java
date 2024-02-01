package com.company;

import java.util.Scanner;
import java.util.Random;

class Game {
    private int userNumber; // user input number
    private int compNumber; // computer guess number
    private int noOfGuesses = 0;

    // constructor -> to generate a random number
    public Game() {
        Random r = new Random();
        compNumber = r.nextInt(100);
    }

    // sets the user number
    public void setNumber(int n) {
        userNumber = n;
    }

    public boolean isCorrect() {
        if (userNumber == compNumber) {
            System.out.format("Yes you guessed it right, it was %d\n You guessed it in %d attempts", compNumber, noOfGuesses);
            return true;
        } else if (userNumber > compNumber) {
            System.out.println("Entered number is Greater. Please Try Again!!");
            noOfGuesses++;
        } else {
            System.out.println("Entered number is Smaller. Please Try Again!!");
            noOfGuesses++;
        }
        return false;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Let's Play the Game");
        Game gm = new Game();
        boolean correct = false;

        while (!correct) {
            System.out.println("Enter a number between 1 to 100 (1-100): ");
            int n = sc.nextInt();
            gm.setNumber(n);
            correct = gm.isCorrect();
        }
    }
}

/*
Create a class Game, which allows a user to play "Guess the NUmber" game once.
Game should have the following methods:
1. Constructor to generate the random number.
2. takeUserInput() to take a user input of number.
3. isCorrectNumber() to detect whether the number entered by the user is true.
4. getter and setter for the noOfGuesses
Use properties such as noOfGuesses(int), etc to get this task done!
 */
