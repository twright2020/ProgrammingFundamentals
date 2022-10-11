package com.wright.javaexercises;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaMethodExerciseOne {
    public static void main(String[] args) {
        JavaMethodExerciseOne methods = new JavaMethodExerciseOne();
        System.out.println("Calling method IsOver30 passing in 34: " + methods.isOver30(34));
        System.out.println("Calling method addTwoNumbers passing in 5 & 10: " + methods.addTwoNumbers(5, 10));
        System.out.println("Calling method subtractTwoNumbers passing in 15 & 10: " + methods.subtractTwoNumbers(15, 10));
        //Calling method to say hello to each student
        String[] studentNames = {"Javon", "David", "Mary", "Odessa"};
        methods.hello(studentNames);
        //Calling method to sum and array of numbers
        int[] numbers = {5, 10, 21, 3};
        System.out.println("Calling method to sum an array of numbers: " + methods.sum(numbers));
        System.out.println("Calling method to find the absolute diff between two numbers passing in 59 & 52: " + methods.absoluteDiff(59, 52));
        System.out.println("Calling method to return a day of the week passing in 5 which corresponds to the fifth day of the week: " + methods.dayOfWeek(5));
        System.out.println("Calling method to return (not print) odd numbers passing in 100 as the upper limit: " + methods.oddNumbersList(100));
        System.out.println("Calling method to return (not print) even numbers passing in 50 as the upper limit: " + methods.evenNumbersList(50));
        System.out.println("Calling method to change text to upper case: " + methods.upperCase("Hello World"));
        System.out.println("Calling method to return the number of numbers in an array that are greater than 10: " + methods.countGreaterThan10(numbers));
        System.out.println("Calling method to return the number of numbers in an array that are less than 10: " +methods.countLessThan10(numbers));
        System.out.println("Calling method to convert 3 numbers to an array: " + Arrays.toString(methods.convertToArray(12, 13, 15)));
        //no need for System.out.println bc you are not asked to print! printing is independent of return
        methods.printOnSeparateLines(numbers);
        int[] arrayOne = {5, 17, 21, 63};
        int[] arrayTwo = {15, 30, 11, 3};
        int[] arrayThree = {51, 10, 27, 3};
        System.out.println("Calling method to return the array with the larger sum: " + Arrays.toString(methods.largerSum(arrayOne, arrayTwo, arrayThree)));
    }

    //A METHOD THAT TELLS IF AGE IS OVER 30
    public boolean isOver30(int age) {
        boolean isOver30;
        if (age > 30) {
            isOver30 = true;

        } else {
            isOver30 = false;
        }
        return isOver30;

        // return age > 30 without 'else' condition so returning the answer
    }


    //A METHOD THAT ADDS TWO NUMBERS
    public int addTwoNumbers(int numberOne, int numberTwo) {
        int sum = numberOne + numberTwo;
        return sum;
    }

    //A METHOD THAT SUBTRACTS TWO NUMBERS
    public int subtractTwoNumbers(int numberOne, int numberTwo) {
        int dif = numberOne - numberTwo;
        return dif;
    }

    //A METHOD THAT SAYS HELLO TO EACH STUDENT
    public void hello(String[] studentNames) {
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("hello " + studentNames[i]);
        }
    }

   /* ANOTHER WAY TO WRITE FOR LOOP TO PRINT HELLO WITH EACH NAME WHICH IS A "FOR EACH LOOP"
   public void hello(String[] studentNames) {
        for (String aName : studentNames) {
            System.out.println(aName);
        }
    }*/

    //A METHOD THAT PROVIDES THE SUM OF THE NUMBERS PROVIDED
    public int sum(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;

    }

    //A METHOD THAT RETURNS THE ABSOLUTE DIFFERENCE BETWEEN TWO NUMBERS
    public int absoluteDiff(int numberOne, int numberTwo) {
        int absoluteDiff;
        if (numberOne > numberTwo) {
            return numberOne - numberTwo;
        } else {
            return (Math.abs(numberOne - numberTwo));
        }
    }

    //A METHOD THAT RETURNS THE DAY OF THE WEEK FOR A NUMBER BETWEEN 1 AND 7
    public String dayOfWeek(int number) {
        String dayOfWeek = null;
        if (number == 1) {
            dayOfWeek = "Sunday";
        } else if (number == 2) {
            dayOfWeek = "Monday";
        } else if (number == 3) {
            dayOfWeek = "Tuesday";

        } else if (number == 4) {
            dayOfWeek = "Wednesday";

        } else if (number == 5) {
            dayOfWeek = "Thursday";

        } else if (number == 6) {
            dayOfWeek = "Friday";
        } else {
            dayOfWeek = "Saturday";
        }
        return dayOfWeek;


    }

    //A METHOD THAT RETURNS ALL THE ODD NUMBERS BETWEEN 1 AND A NUMBER
    public ArrayList<Integer> oddNumbersList(int upperLimit) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int oddNumber = 1; oddNumber <= upperLimit; oddNumber++) {
            if (oddNumber % 2 != 0) {
                oddNumbers.add(oddNumber);
                // System.out.println(oddNumber + " is an odd number. ");

            }

        }
        return oddNumbers;
    }

    //A METHOD THAT RETURNS ALL THE EVEN NUMBERS BETWEEN 1 AND A NUMBER
    public ArrayList<Integer> evenNumbersList(int upperLimit) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int evenNumber = 0; evenNumber <= upperLimit; evenNumber++) {
            if (evenNumber % 2 == 0) {
                evenNumbers.add(evenNumber);

                // System.out.println(evenNumber + " is an even number. ");

            }

        }
        return evenNumbers;

    }

    //A METHOD THAT CONVERTS TEXT TO UPPERCASE
    public String upperCase(String text) {
        return (text.toUpperCase());
    }


    //A METHOD THAT RETURNS THE TOTAL NUMBER OF STUDENTS
    public int numberOfItems(String[] studentNames) {
        return studentNames.length;

    }

    //A METHOD THAT RETURNS THE COUNT OF NUMBERS THAT ARE GREATER THAN 10
    public int countGreaterThan10(int[] numbers) {

        int greaterThan10 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 10) {
                greaterThan10 = greaterThan10 + 1;
            }

        }
        return greaterThan10;
    }

/* USING FOR EACH LOOP INSTEAD OF FOR LOOP
for(int aNumber : numbers) {
     if(aNumber > 10){
     greaterThan10 = greaterThan10 + 1;
}
}
return greaterThan10
 */

    //A METHOD THAT RETURNS THE COUNT OF NUMBERS THAT ARE LESS THAN 10
    public int countLessThan10(int[] numbers) {
        int lessThan10 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 10) {
                lessThan10 = lessThan10 + 1;
            }
        }

        return lessThan10;
    }

    /* USING FOR EACH LOOP INSTEAD OF FOR LOOP
    for(int aNumber : numbers){
    if(aNumber < 10){
    lessThan10 = lessThan10 + 1;
    }
    }
     */

    //A METHOD THAT CONVERTS 3 NUMBERS TO AN ARRAY OF INTEGERS
    public int[] convertToArray(int numberOne, int numberTwo, int numberThree) {
        int[] convertToArray = {numberOne, numberTwo, numberThree};
        return convertToArray;
    }

    //A METHOD THAT PRINTS ALL THE NUMBERS ON SEPARATE LINES
    public void printOnSeparateLines(int[] numbers) {
        for (int aNumber : numbers) {

            System.out.println(aNumber);

        }
    }

    //A METHOD THAT RETURNS THE ARRAY WITH A LARGER SUM
    public int[] largerSum(int[] arrayOne, int[] arrayTwo, int[] arrayThree) {

        int i;
        int sumOne = 0;
        int sumTwo = 0;
        int sumThree = 0;

        for (i = 0; i < arrayOne.length; i++) {
            sumOne = sumOne + arrayOne[i];
        }

        for (i = 0; i < arrayTwo.length; i++) {
            sumTwo = sumTwo + arrayTwo[i];
        }

        for (i = 0; i < arrayThree.length; i++) {
            sumThree = sumThree + arrayThree[i];
        }
        if ((sumOne > sumTwo) && (sumOne > sumThree)) {
            return arrayOne;

        } else if ((sumTwo > sumOne) && (sumTwo > sumThree)) {

            return arrayTwo;

        } else {

            return arrayThree;
        }

    }
}


