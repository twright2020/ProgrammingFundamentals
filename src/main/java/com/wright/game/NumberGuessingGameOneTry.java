package com.wright.game;

import java.util.Scanner;

public class NumberGuessingGameOneTry {
    public static void main(String[] args) {
        int guessNumber;
        int number =  (int) ((Math.random() * (100 - 1)) + 1);

        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the number guessing game");
                System.out.println("A number is chosen between 1 to 100. Guess the number within 1 trial.");
        System.out.println ("Guess a number between 1 and 100");
        guessNumber = userInput.nextInt();
        System.out.println ("The random number is " + number);
        if (guessNumber > number){
            System.out.println("The number you guessed is too high");
        } else if (guessNumber < number){
            System.out.println("The number you guessed is too low");
        } else {
            System.out.println("You guessed correctly");
        }


    }
}