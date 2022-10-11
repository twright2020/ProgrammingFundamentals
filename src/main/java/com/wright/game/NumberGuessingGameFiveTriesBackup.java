package com.wright.game;

import java.util.Scanner;

public class NumberGuessingGameFiveTriesBackup {
    public static void main(String[] args){
        int guessNumber;
        int numberOfTries = 5;
        int i = 0;
        int number =  (int) ((Math.random() * (100 - 1)) + 1);

        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the number guessing game");

        System.out.println("A number is chosen between 1 to 100. Guess the number with 5 tries.");
        System.out.println ("Guess a number between 1 and 100");

        for (i = 0; i < numberOfTries; i++) {

                guessNumber = userInput.nextInt();

            if (guessNumber > number){
                System.out.println("The number you guessed is too high");
            } else if (guessNumber < number){
                System.out.println("The number you guessed is too low");
            } else {
                System.out.println("You guessed correctly");
                break;
            }
                System.out.println("What is your second guess? ");
            guessNumber = userInput.nextInt();
                if (guessNumber > number) {
                    System.out.println("The number you guessed is too high");
                } else if (guessNumber < number) {
                    System.out.println("The number you guessed is too low");
                } else {
                    System.out.println("You guessed correctly");
                    break;
                }

                    System.out.println("What is your third guess? ");
            guessNumber = userInput.nextInt();
                    if (guessNumber > number) {
                        System.out.println("The number you guessed is too high");
                    } else if (guessNumber < number) {
                        System.out.println("The number you guessed is too low");
                    } else {
                        System.out.println("You guessed correctly");
                        break;
                    }

                        System.out.println("What is your fourth guess? ");
            guessNumber = userInput.nextInt();
                        if (guessNumber > number) {
                            System.out.println("The number you guessed is too high");
                        } else if (guessNumber < number) {
                            System.out.println("The number you guessed is too low");
                        } else {
                            System.out.println("You guessed correctly");
                            break;
                        }

                            System.out.println("What is your fifth guess? ");
            guessNumber = userInput.nextInt();
                            if (guessNumber > number) {
                                System.out.println("The number you guessed is too high");
                            } else if (guessNumber < number) {
                                System.out.println("The number you guessed is too low");
                            } else {
                                System.out.println("You guessed correctly");
                                break;
                            }

                                System.out.println("The random number is " + number);

                            }
                        }
                    }