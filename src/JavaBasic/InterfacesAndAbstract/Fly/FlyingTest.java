package JavaBasic.InterfacesAndAbstract.Fly;

public class FlyingTest {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        bird.fly();
        Flyable airplane = new Airplane();
        airplane.fly();
    }
}
