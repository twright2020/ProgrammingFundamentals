package com.wright.calculator;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGradeCalculatorSwitchStatements {
    public static void main(String[] args) {
        int[] studentOneGrades = {78, 89, 78, 80};
        int[] studentTwoGrades = {78, 67, 68, 92};
        int[] studentThreeGrades = {88, 92, 92, 94};

        String[] students = {"Student One", "Student Two", "Student Three"};

        int[] grades = null;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Student Names: " + Arrays.toString(students));

        System.out.println("Enter a Student's name: ");

        String selectedStudentName = userInput.nextLine();

        if (selectedStudentName.equalsIgnoreCase("Student One")) {
            grades = studentOneGrades;

        } else if (selectedStudentName.equalsIgnoreCase("Student Two")) {
            grades = studentTwoGrades;

        } else if (selectedStudentName.equalsIgnoreCase("Student Three")) {
            grades = studentThreeGrades;

        } else {
            System.out.println("There is no student with that name.");
            System.exit(1);
        }


        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        double numberOfGrades = grades.length;
        double average = sum / numberOfGrades;


        System.out.println("Sum " + sum);
        System.out.println("Average " + average);

        String finalGrade;

        if (average >= 90) {
            finalGrade = "A";
            System.out.println("A");

        } else if (average > +80) {
            finalGrade = "B";
            System.out.println("B");

        } else if (average > +70) {
            finalGrade = "C";
            System.out.println("C");

        } else if (average > +60) {
            finalGrade = "D";
            System.out.println("D");

        } else {
            finalGrade = "F";
            System.out.println("F");


        }
// System.out.println(finalGrade) Just include this one liner instead of all the printout lines in if statements

        switch (finalGrade) {

            case "A":
                System.out.println("Excellent");
                break;

            case "B":
                System.out.println("Well Done");
                break;

            case "C":
                System.out.println("You Passed");
                break;

            case "D":
                System.out.println("Try Again");
                break;

            case "F":
                System.out.println("Try Again");
                break;

            default:
                System.out.println("Invalid Grade");
                break;
        }
    }
}
