package Java8.FunctionalProgramming;

import java.util.function.Consumer;

public class MessagePrinter {
    public static void main(String[] args) {
        Consumer<String> printMessage = message -> System.out.println("Message: "+message);
        printMessage.accept("Hello, Naveen!");
    }
}
