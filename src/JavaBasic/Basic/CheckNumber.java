package JavaBasic.Basic;

//Write a Java program to check if a number is positive, negative, or zero.

public class CheckNumber {

    public static void main(String[] args) {
        int num = 0;

        if (num > 0){
            System.out.println(num+" is positive ");
        } else if (num < 0) {
            System.out.println(num + " is negative ");
        } else {
            System.out.println(num + " is Zero");
        }
    }
}
