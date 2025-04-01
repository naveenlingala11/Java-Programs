package JavaBasic.ClassesAndObjects;

import java.util.Scanner;

public class Student {
    String name;
    int rollNumber;

    public Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public void display(){
        System.out.println("Student "+name+" rollNumber "+rollNumber);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        String name = scan.nextLine();
        System.out.println("Enter the roll number of the student: ");
        int roll = scan.nextInt();
        Student s1 = new Student(name, roll);
        s1.display();
    }
}
