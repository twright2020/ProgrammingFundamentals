package com.wright.calculator;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGradeCalculator {
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

        if (average >= 90)
        {
            System.out.println("A");

        } else if (average > +80){
        System.out.println("B");

    } else if(average >+70){
        System.out.println("C");

}  else if (average >+ 60){
        System.out.println("D");

        } else {
    System.out.println("F");


}

    }
}
