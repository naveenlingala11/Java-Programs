package JavaBasic.ClassesAndObjects;

public class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println(" Name is "+name+" and age is "+age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Naveen", 25);
        p1.display();
    }
}
