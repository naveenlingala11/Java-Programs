package JavaBasic.Methods;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class SwapNumbers {
    public static void swap(int a, int b){
        System.out.println("Before swapping a: "+a+" b: "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping a: "+a+" b: "+b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n = scan.nextInt();
        System.out.println(" Enter the second number: ");
        int m = scan.nextInt();

        swap(n,m);
    }
}
