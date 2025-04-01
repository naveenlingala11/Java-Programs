package JavaBasic.Methods;

import java.util.Scanner;

public class MaxInArray {
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int num : arr){
            if ( num > max) max = num;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the size of an array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i<n; i++){
            arr[i]= scan.nextInt();
        }

        System.out.println("The max element in the array is "+findMax(arr));
    }
}
