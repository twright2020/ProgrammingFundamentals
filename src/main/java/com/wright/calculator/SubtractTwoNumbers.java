package com.wright.calculator;

import java.util.Scanner;

public class SubtractTwoNumbers {
    public static void main(String [] args){
        int numberOne;
        int numberTwo;

        int Answer;

        System.out.println("Hello! This is my Simple Calculator for Subtracting Two Numbers. ");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please provide the first number: ");
        numberOne = userInput.nextInt();
        System.out.println("Please provide the second number: ");
        numberTwo = userInput.nextInt();
        Answer = numberOne - numberTwo;
        String answer;
        System.out.println(numberOne + " subtract " + numberTwo + " = " + Answer);
    }
}
