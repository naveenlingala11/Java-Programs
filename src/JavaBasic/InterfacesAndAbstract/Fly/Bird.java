package JavaBasic.InterfacesAndAbstract.Fly;

public class Bird implements Flyable{
    @Override
    public void fly(){
        System.out.println("Bird is flying...");
    }
}
