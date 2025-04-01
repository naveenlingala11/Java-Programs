package JavaBasic.Inheritance.Vehicle;

public class Car extends Vehicle{
    @Override
    public void details(){
        System.out.println("This is a car. ");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.details();
    }
}
