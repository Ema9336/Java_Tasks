package jd_tasks_07;

public class RectangleClients {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();

        rectangle1.width = 12;
        rectangle1.length = 16;
        System.out.println("Rectangle1 = "+rectangle1.toString());
        System.out.println("Rectangle1 area = "+rectangle1.calculateArea());
        System.out.println("Rectangle1 perimeter = "+rectangle1.calculatePerimeter());

        System.out.println("______________________________________________");
        Rectangle rectangle2 = new Rectangle();
        rectangle2.length = 8;
        rectangle2.width = 12;

        System.out.println("Rectangle2 "+rectangle2.toString());
        System.out.println("Rectangle2 area = "+rectangle2.calculateArea());
        System.out.println("Rectangle2 perimeter = "+rectangle2.calculatePerimeter());





    }

}
