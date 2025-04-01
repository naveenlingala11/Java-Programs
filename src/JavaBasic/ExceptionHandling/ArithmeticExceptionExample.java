package JavaBasic.ExceptionHandling;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("result "+ result);
        }catch (ArithmeticException e){
            System.out.println("Error: Cannot divide by zero!");
        }
    }
}
