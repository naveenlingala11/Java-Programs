package JavaBasic.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Largest in the array is: "+arr[n-1]);
        System.out.println("Smallest in the array is: "+arr[0]);
    }
}
