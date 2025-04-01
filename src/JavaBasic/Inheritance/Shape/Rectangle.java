package JavaBasic.Inheritance.Shape;

import org.w3c.dom.css.Rect;

public class Rectangle extends Shape{
    double l , b;
    public Rectangle( double l, double b){
        this.l = l;
        this.b = b;
    }
    public double area(){
        return l * b;
    }
    @Override
    public void display(){
        System.out.println("This is a Rectangle with area "+area());
    }

}
