package jd_tasks_13;
//3.2 UndergraduateStudent:
//       - Same as GraduateStudent.
public class UndergraduateStudent extends Student1 {
    public UndergraduateStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        super.study();
    }
}
