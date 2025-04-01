package Java8.LambdasAndFunctionalInterfaces.Calculator;

public class CalculateLambda {
    public static void main(String[] args) {
        Calculator add = (a,b) -> a + b;
        System.out.println("Sum: "+add.calculate(10,20));
    }
}
