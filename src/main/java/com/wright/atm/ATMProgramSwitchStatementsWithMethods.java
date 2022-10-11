package com.wright.atm;

import java.util.Scanner;

public class ATMProgramSwitchStatementsWithMethods {

    public double withdrawal(double withdrawalAmount, double totalBalance) {
             if (withdrawalAmount <= totalBalance) {
            System.out.println("Withdrawal successful! Please collect your money.");
            totalBalance = totalBalance - withdrawalAmount;
        } else {
            System.out.println("Insufficient Funds");
        }
        return totalBalance;
    }

    public double deposit(double depositAmount, double totalBalance){
       System.out.println("Please deposit your money.");
        System.out.println("Deposit successful!");
        totalBalance = totalBalance + depositAmount;

        return totalBalance;
    }

    public void balance(double totalBalance) {
        System.out.println("Your Total Balance is: " + totalBalance);
    }

    public static void main(String[] args) {
        double withdrawalAmount;
        double depositAmount;
        double totalBalance = 10000;

        String loopResponse;

        System.out.println("Welcome to your Bank's ATM");

        Scanner userInput = new Scanner(System.in);

        ATMProgramSwitchStatementsWithMethods atm = new ATMProgramSwitchStatementsWithMethods();


        do {
            System.out.println("Please select from the following options: Enter 1 to Withdraw, Enter 2 to Deposit, Enter 3 to Check your balance: ");
            int atmUser = userInput.nextInt();

            switch (atmUser) {
                case 1:
                    System.out.println("Please enter your withdrawal amount: ");
                    withdrawalAmount = userInput.nextDouble();
                totalBalance= atm.withdrawal(withdrawalAmount, totalBalance);
                    break;

                case 2:
                    System.out.println("Please enter your deposit amount: ");
                    depositAmount = userInput.nextDouble();
                   totalBalance = atm.deposit(depositAmount, totalBalance);
                    break;

                case 3:
                    atm.balance(totalBalance);
                    break;

            }
            System.out.print("Would you like to perform another transaction? Enter Y or N ");
            userInput.nextLine();
            loopResponse = userInput.nextLine();
        }

        while (loopResponse.equalsIgnoreCase("Y"));

    }

}



