package jd_tasks_13;
// 3.3 CydeoStudent:
//       - Additional Attributes:
//           - batchNumber: int
//           - groupNumber: int
//           - programmingLanguage: String
//       - Encapsulation:
//           - Same as previous tasks.
//       - Constructor:
//           - Same as previous tasks.
//       - Actions:
//           - Override the study method.
//           - Override the toString method.
public class StudentClients {

    public static void main(String[] args) {

        Student student = new Student("Ema", 28, "Female");
        Student1 student1 = new Student1("Ratko", 30, "Male", "800", "IT", 'A', "MIT");
        GraduateStudent graduateStudent = new GraduateStudent("Caci", 26, "Female", "565", "Mathematics", 'B', "MIT");
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Hassan", 24, "Male", "500", "History", 'C', "BostonU");
        CydeoStudent cydeoStudent = new CydeoStudent("Filip", 31, "Male", 956, 9, "Java");

        System.out.println(student);
        System.out.println(student1);
        System.out.println(graduateStudent);
        System.out.println(undergraduateStudent);
        System.out.println(cydeoStudent);

        student1.study();
        graduateStudent.study();
        undergraduateStudent.study();
        cydeoStudent.study();
    }


}
