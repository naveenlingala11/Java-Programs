package JavaBasic.Arrays;

//Write a Java program to find the maximum and minimum element in an array.

public class MaxMinArray {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        // Initialize max and min with the first element of the array.
        int max = numbers[0];
        int min = numbers[0];

        // Iterate through the array to find max and min.
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if a larger element is found.
            }
            if (numbers[i] < min) {
                min = numbers[i]; // Update min if a smaller element is found.
            }
        }

        // Print the maximum and minimum elements.
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}