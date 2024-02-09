package jd_tasks_09;
//2. Create a class named ClassMatesInitials and write a program with the following specifications:
//   2.1 Create an array of strings named classmates.
//   2.2 Store full names of 10 classmates.
//   2.3 Print the initials of each student's name in separate lines.

public class ClassMatesInitials {


    public static void main(String[] args) {

        String[] classmates = {"Ema Jovanova", "Fili Jovanov", "Derek Mull"
                , "Yuse Malek", "Emily Turk", "Ratko Matev", "Brett Hull", "Richard Ponic", "Sam Adams", "Slave Slavovik"};


        for (int i = 0; i < classmates.length; i++) {

            String initials = classmates[i].charAt(0) + "" + classmates[i].charAt(classmates[i].indexOf(" ") + 1);

            System.out.println(initials);
        }
    }

}
