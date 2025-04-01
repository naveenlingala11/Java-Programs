package JavaBasic.InterfacesAndAbstract.Vehicle;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car is starting with a key.");
    }
}
