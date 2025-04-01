package JavaBasic.Basic;

//Write a Java program to calculate the perimeter and area of a rectangle.

public class RectangleCalculations {
    public static void main(String[] args) {
        int length = 10;
        float breadth = 20.5f;

        float area = length * breadth;
        float perimeter = 2 * ( length + breadth);

        System.out.println("The Area of Rectangle is = "+area);
        System.out.println("The Perimeter of Rectangle is = "+perimeter);

    }

}
