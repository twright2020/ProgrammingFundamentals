package com.wright.atm;

import java.util.Scanner;

public class ATMProgram {
    public static void main(String[] args) {
        double withdrawalAmount;
        double depositAmount;
        double totalBalance = 10000;

        String loopResponse;

        System.out.println("Welcome to your Bank's ATM");

        Scanner userInput = new Scanner(System.in);
        do {
            System.out.println("Please select from the following options: Enter 1 to Withdraw, Enter 2 to Deposit, Enter 3 to Check your balance: ");
            int atmUser = userInput.nextInt();

            if (atmUser == 1) {
                System.out.println("Please enter your withdrawal amount: ");
                withdrawalAmount = userInput.nextDouble();
                if (withdrawalAmount <= totalBalance) {
                    System.out.println("Withdrawal successful! Please collect your money.");
                    totalBalance = totalBalance - withdrawalAmount;
                } else {
                    System.out.println("Insufficient Funds");
            }

            } else if (atmUser == 2) {
                System.out.println("Please enter your deposit amount: ");
                depositAmount = userInput.nextDouble();
                System.out.println("Please deposit your money.");
                System.out.println("Deposit successful!");
                totalBalance = totalBalance + depositAmount;

            } else {
                System.out.println("Your balance is : " + totalBalance);
            }
            System.out.print("Would you like to perform another transaction? Enter Y or N ");
            userInput.nextLine();
            loopResponse = userInput.nextLine();
        }

        while(loopResponse.equalsIgnoreCase("Y"));

}

    }



