package JavaBasic.Inheritance.Shape;

import java.lang.foreign.Arena;

public class Circle extends Shape{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    @Override
    public void display(){
        System.out.println("This is a circle with area "+area());
    }

}
