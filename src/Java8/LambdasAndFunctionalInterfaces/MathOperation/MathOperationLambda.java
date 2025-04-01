package Java8.LambdasAndFunctionalInterfaces.MathOperation;

public class MathOperationLambda {
    public static void main(String[] args) {

        MathOperation multiply = (a,b) -> a * b;
        System.out.println("Multiplication: "+multiply.multiply(2,3));
    }
}
