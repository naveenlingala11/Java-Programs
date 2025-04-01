package JavaBasic.Methods;

import java.util.Scanner;

public class PrimeCheck {
    public static boolean isPrime(int num){
        if ( num < 2) return false;
        for (int i =2; i <= Math.sqrt(num); i++){
            if ( num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter a numner: ");
        int n = scan.nextInt();
        System.out.println(n + " is " + (isPrime(n)?"a prime number ":"not a prime number"));
    }
}
