package JavaBasic.Polymorphism.Printer;

public class Printer {
    // Print an integer
    public void print(int value) {
        System.out.println("Integer: " + value);
    }

    // Print a double
    public void print(double value) {
        System.out.println("Double: " + value);
    }

    // Print a string
    public void print(String message) {
        System.out.println("String: " + message);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print(100);
        printer.print(25.75);
        printer.print("Hello, World!");
    }
}
