package com.wright.game;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String usersMove;
        String opponentsMove;
        int numberOfTries = 3;
        int i = 0;


        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the Rock, Paper, Scissors!");

        for (i = 0; i < numberOfTries; i++) {
            System.out.println("What is your move? To make a move, enter rock, paper, or scissors. : ");

            int randomNumber = (int) ((Math.random() * (4 - 1)) + 1);
            usersMove = userInput.nextLine();

            if (usersMove.equalsIgnoreCase("rock")
                    || usersMove.equalsIgnoreCase("paper")
                    || usersMove.equalsIgnoreCase("scissors")) {

            } else {
                System.out.println("Your move is invalid!");
            }
            if (randomNumber == 1) {
                opponentsMove = "rock";
            } else if (randomNumber == 2) {
                opponentsMove = "paper";
            } else {
                opponentsMove = "scissors";
            }

            if (usersMove.equalsIgnoreCase(opponentsMove)) {
                System.out.println("It's a tie!");
            } else if ((usersMove.equalsIgnoreCase("rock")) && (opponentsMove.equalsIgnoreCase("scissors"))) {
                System.out.println("You win");
            } else if ((usersMove.equalsIgnoreCase("scissors")) && (opponentsMove.equalsIgnoreCase("paper"))) {
                System.out.println("You win");
            } else if ((usersMove.equalsIgnoreCase("paper")) && (opponentsMove.equalsIgnoreCase("rock"))) {
                System.out.println("You win");
            } else {
                System.out.println("You lose");

            }
            System.out.println("Your opponent chose " + opponentsMove);
        }
    }
}

