package JavaBasic.ControlStatements;

//Write a Java program to calculate a student's grade based on marks using if-else.

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the student's marks: ");
        int marks = scan.nextInt();

        char grade;

        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("The student's grade is: " + grade);
    }
}
