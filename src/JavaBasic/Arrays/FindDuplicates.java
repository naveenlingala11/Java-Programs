package JavaBasic.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Duplicate elements in array: ");
        boolean found = false;
        for (int i = 0; i<n; i++){
            for (int j = i + 1; j < n; j++){
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]+" ");
                    found = true;
                    break;
                }
            }
        }
        if (!found){
            System.out.println("No Duplicate elements found; ");
        }

    }
}
