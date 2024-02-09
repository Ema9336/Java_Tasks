package jd_tasks_09;
//6. Create a class named ClassMatesReversed and write a program with the following specifications:
//   6.1 Create an array of strings named classmates.
//   6.2 Store full names of 10 classmates.
//   6.3 Reverse each student's name and print them on separate lines.


public class ClassMatesReversed {

    public static void main(String[] args) {


        String[] classmates = {"Ema Jovanova", "Fili Jovanov", "Derek Mull"
                , "Yuse Malek", "Emily Turk", "Ratko Matev", "Brett Hull", "Richard Ponic", "Sam Adams", "Slave Slavovik"};

        for (int i = classmates.length - 1; i >= 0; i--) {
            System.out.println(classmates[i] + " ");
        }
    }

}
