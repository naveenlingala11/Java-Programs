package JavaBasic.ClassesAndObjects;

public class Rectangle {
    double length, width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double area(){
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2 , 3);
        System.out.println("the area is "+r1.area());
    }
}
