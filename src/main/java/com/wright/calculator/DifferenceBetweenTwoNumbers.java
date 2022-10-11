package com.wright.calculator;

import java.util.Scanner;

public class DifferenceBetweenTwoNumbers {
    public static void main(String [] args) {
        int numberOne;
        int numberTwo;

        int diff;

        System.out.println("Hello! This is my Simple Calculator for Finding the Difference Between Two Numbers. ");
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please provide the first number: ");
        numberOne = userInput.nextInt();
        System.out.println("Please provide the second number: ");

        numberTwo = userInput.nextInt();

        if (numberOne > numberTwo){
            diff = numberOne - numberTwo;
        } else {
            diff = numberTwo - numberOne;
        }
        System.out.println("The difference between " + numberOne + " and " + numberTwo + " is " + diff);

        }
    }

