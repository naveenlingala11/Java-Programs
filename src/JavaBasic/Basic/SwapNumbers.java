package JavaBasic.Basic;

//Write a Java program to swap two numbers without using a third variable.

public class SwapNumbers {
    // without using third variable

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(" Before swapping a = "+a+" and b = "+b);

        a = a + b; // a now holds the sum of original a and b
        b = a - b; // b now holds the original value of a (sum - original b)
        a = a - b; // a now holds the original value of b (sum - original a)

        System.out.println(" After swapping a = "+ a + " and b = " + b);

    }
}
