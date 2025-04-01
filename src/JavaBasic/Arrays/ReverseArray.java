package JavaBasic.Arrays;

import java.util.Scanner;

// Write a Java program to reverse an array.
public class ReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter the size of array ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Reversed Array: ");
        for ( int i = n-1; i >= 0; i--){
            System.out.println(arr[i]+" ");
        }

    }
}
