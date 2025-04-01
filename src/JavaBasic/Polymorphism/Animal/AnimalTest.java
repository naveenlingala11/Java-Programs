package JavaBasic.Polymorphism.Animal;

public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new cat();
        Animal lion = new Lion();
        dog.sound();
        cat.sound();
        lion.sound();
    }
}
