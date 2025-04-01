package JavaBasic.Basic;

//Write a Java program to calculate the simple interest.

public class SimpleInterest {
    public static void main(String[] args) {
        double principal = 1000; // Principal amount
        double rate = 5;       // Annual interest rate (in percentage)
        double time = 2;       // Time period in years

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Principal: " + principal);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time Period: " + time + " years");
        System.out.println("Simple Interest: " + simpleInterest);
    }
}