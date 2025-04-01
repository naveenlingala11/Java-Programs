package JavaBasic.InterfacesAndAbstract.Animal;

public class Dog implements Animal{
    @Override
    public void sound(){
        System.out.println("Dog sounds like Bark.");
    }
}
