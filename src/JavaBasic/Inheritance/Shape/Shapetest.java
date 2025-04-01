package JavaBasic.Inheritance.Shape;

import java.util.Scanner;

public class Shapetest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        double r = scan.nextDouble();
        System.out.println("Enter the length of the rectangle: ");
        double l = scan.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        double b = scan.nextDouble();
        Circle c = new Circle(r);
        Rectangle rec = new Rectangle(l,b);
        c.display();
        rec.display();
    }
}
