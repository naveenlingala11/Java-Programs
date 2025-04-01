package JavaBasic.Loops;

//Write a Java program to print even numbers from 1 to 50 using a while loop.
public class EvenNumbersWhile {
    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 50 using while loop:");
         int i = 2;
          while ( i <= 50){
              System.out.print(i+" ");
              i += 2;
          }
        System.out.println();
    }
}
