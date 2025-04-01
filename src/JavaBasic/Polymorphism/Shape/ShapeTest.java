package JavaBasic.Polymorphism.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
