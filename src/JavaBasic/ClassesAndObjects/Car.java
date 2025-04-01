package JavaBasic.ClassesAndObjects;

public class Car {
    String make, model;
    int year;

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void display(){
        System.out.println(" make "+make+" model "+model+" year "+year);
    }

    public static void main(String[] args) {
        Car c1 = new Car("Mahindra", "AX5",2025);
        c1.display();
    }
}
