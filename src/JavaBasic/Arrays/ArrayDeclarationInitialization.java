package JavaBasic.Arrays;

//Write a Java program to declare and initialize an array of integers.
public class ArrayDeclarationInitialization {
    public static void main(String[] args) {
        // Declare an integer array named 'numbers' and initialize it with values.
        int[] numbers = {10, 20, 30, 40, 50};

        // Print the array elements using a for-each loop.
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); // Add a newline at the end
    }
}
