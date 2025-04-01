package JavaBasic.Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the size of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr){
        freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }
        System.out.println("element frequency: ");
        for (int key: freqMap.keySet()){
            System.out.println(key + " -> "+freqMap.get(key));
        }
    }
}
