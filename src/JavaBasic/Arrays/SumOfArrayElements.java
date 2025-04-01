package JavaBasic.Arrays;

//  Write a Java program to find the sum of all elements in an array.

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Initialize sum to 0.
        int sum = 0;

        // Iterate through the array and add each element to the sum.
        for (int number : numbers) {
            sum += number;
        }

        // Print the sum of array elements.
        System.out.println("Sum of array elements: " + sum);
    }
}
