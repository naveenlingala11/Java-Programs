package JavaBasic.InterfacesAndAbstract.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s = new Circle();
        Shape r = new Rectangle();
        s.draw();
        r.draw();
    }
}
