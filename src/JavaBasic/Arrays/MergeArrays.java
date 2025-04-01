package JavaBasic.Arrays;

import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the arrays");
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        System.out.println("Enter the first array elements: ");
        for (int i = 0 ; i < n; i++){
            arr1[i] = scan.nextInt();
        }
        System.out.println("Enter the second array elements: ");
        for (int j = 0; j < m; j++){
            arr2[j] = scan.nextInt();
        }

        int[] mergedArray = new int[n+m];
        System.arraycopy(arr1, 0,mergedArray,0,n);
        System.arraycopy(arr2, 0, mergedArray, n, m);
        System.out.println("Merged Array: ");
        for (int num : mergedArray){
            System.out.println(num + " ");
        }
    }

}
