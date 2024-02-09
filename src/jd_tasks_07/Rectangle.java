package jd_tasks_07;
//Attributes:
//            width (double): used for storing the width of the rectangle.
//            length (double): used for storing the length of the rectangle.
//
//      Actions:
//            calculateArea(): calculates the area of the rectangle, and returns it as a double.
//            calculatePerimeter(): calculates the perimeter of the rectangle, and returns it.
//            toString(): returns a string representation of the rectangle object.
//
//
//      Create another class named RectangleClients, create multiple rectangle objects, and test each function of the rectangle object.

public class Rectangle {

    public double width;
    public double length;


    public double calculateArea(){
        double areaOfRectangle = width * length;
        return areaOfRectangle;
    }

    public double calculatePerimeter(){
        double perimeter = 2 * (width * length);
        return perimeter;
    }

    public String toString(){
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
