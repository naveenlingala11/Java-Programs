package JavaBasic.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println(" Enter the elements of the array; ");
        for (int i = 0; i< n; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Largest element in the array is "+arr[n - 1]);
    }
}
