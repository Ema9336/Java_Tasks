package jd_tasks_13;
// Create the following subclasses of the Student class:
//   3.1 GraduateStudent:
//       - Override the study method.
//       - Add any additional fields and methods as necessary.
public class GraduateStudent extends Student1{

    public GraduateStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }
    @Override
    public void study(){
        super.study();
    }
}
