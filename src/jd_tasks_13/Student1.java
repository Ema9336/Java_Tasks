package jd_tasks_13;
//Create a subclass named "Student" with the following specifications:
//   Attributes:
//       - studentId: String
//       - fieldOfStudy: String
//       - grade: char
//       - schoolName: String
//
//   Encapsulation:
//       - Same as previous tasks.
//
//   Actions:
//       - study(): Displays a message stating the student's name and school.
//       - toString(): Prints the information of the Student object (including all attributes).
public class Student1 extends Student{
    private String studentId;
    private String fieldOfStudy;
    private char grade;
    private String schoolName;
    public Student1(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        if (studentId==null||studentId.isEmpty()||studentId.isBlank()){
            System.err.println("Student Id can not be null, empty or blank.");
            System.exit(1);
        }
        this.studentId = studentId;
    }
    public String getFieldOfStudy() {
        return fieldOfStudy;
    }
    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy==null||fieldOfStudy.isEmpty()||fieldOfStudy.isBlank()){
            System.err.println("Field of study can not be null, empty or blank.");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }
    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        if (schoolName==null||schoolName.isEmpty()||schoolName.isBlank()){
            System.err.println("School name can not be null, empty or blank.");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }
    public void study(){
        System.out.println(super.getName() + " is Student in " + schoolName);
    }
    @Override
    public String toString() {
        return super.toString()+"{" +
                "studentId='" + studentId + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}

