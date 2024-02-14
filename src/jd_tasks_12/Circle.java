package jd_tasks_12;
//Attributes:
//		radius
//
//	Ensure encapsulation for the field.
//		Condition:
//			The radius cannot be set to a negative or zero value.
//
//	Add a constructor that allows the user to set the field during object creation.
//
//	Actions:
//		calcArea(): Calculates and returns the area of the circle object.
//		calcPerimeter(): Calculates and returns the perimeter of the circle object.
//		toString(): Displays the radius, area, and perimeter of the circle when the object is printed.
//
//	Create another class named CircleClients, create multiple circle objects, and test each function of the circle object.

public class Circle {
    private double radius;

    public void setRadius(double radius) {

        if(radius<=0){
            System.err.println("The radius cannot be set to a negative or zero value.");
            System.exit(1);
        }
        this.radius = radius;
    }

    public double getRadius() {

        if(radius<=0){
            System.err.println("The radius cannot be set to a negative or zero value.");
            System.exit(1);
        }
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calcArea(){
        return radius*radius*Math.PI;
    }
    public double calcPerimeter(){
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}


