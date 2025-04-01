package JavaBasic.Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        System.out.println("Enter the first array elements: ");
        for (int i = 0; i<n; i++){
            arr1[i] = scan.nextInt();
        }
        System.out.println("Enter the second array elements: ");
        for (int j = 0; j < m; j++){
            arr2[j] = scan.nextInt();
        }
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : arr1){
            set1.add(num);
        }
        System.out.println("Common Elements ");
        boolean found = false;
        for (int num : arr2){
            if (set1.contains(num)){
                System.out.println(num + " ");
                found = true;
            }
        }
        if (!found){
            System.out.println("No Common Elements Found.");
        }
    }
}
