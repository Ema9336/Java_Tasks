package jd_tasks_11;

public class CydeoStudentClients {
    public static void main(String[] args) {

        CydeoStudent.schoolName = "CYDEO";
        CydeoStudent.programmingLanguage = "Java";

        CydeoStudent.printSchoolName();
        CydeoStudent.printProgLanguage();

        CydeoStudent student1 = new CydeoStudent("Ema", 28, "A109", "A", 808,9);
        CydeoStudent student2 = new CydeoStudent("Khasan", 24, "A112", "A", 900,9);

        student1.study();
        student2.attendClass();

        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
    }
}
