package JavaBasic.ClassesAndObjects;

import java.util.Scanner;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public double calculateAnnualSalary(){
        return salary * 12;
    }
    public void display(){
        System.out.println("Annual salary of "+name+" is "+calculateAnnualSalary());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        double n = scan.nextDouble();
        Employee e1 = new Employee(str, n);
        e1.display();
    }
}
