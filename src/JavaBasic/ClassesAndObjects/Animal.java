package JavaBasic.ClassesAndObjects;

public class Animal {
    public void sound(){
        System.out.println("Animals makes different sounds! ");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
    }
}
