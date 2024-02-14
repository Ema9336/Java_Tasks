package jd_tasks_12;

public class Rectangle {

        private double width;
        private double length;

        Rectangle(double width, double length) {
            setWidth(width);
            setLength(length);

        }

        public double getWidth() {

            return width;
        }

        public double getLength() {

            return length;
        }
        private double calcArea(){

            return width*length;
        }

        private double calcPerimeter(){

            return 2* (length+width);
        }

        public void setWidth(double width) {
            if (width <=0){
                System.err.println("The width cannot be set to a negative or zero value: " + width);
                System.exit(1);
            }
            this.width = width;
        }

        public void setLength(double length) {
            if (length <=0){
                System.err.println("The length cannot be set to a negative or zero value: " + length);
                System.exit(1);
            }
            this.length = length;
        }



        public String toString() {
            return "Rectangle{" +
                    "width=" + width +
                    ", length=" + length +
                    ", area=" + calcArea() +
                    ", perimeter=" + calcPerimeter() +
                    '}';
        }
}
