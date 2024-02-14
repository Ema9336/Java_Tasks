package jd_tasks_11;
///4. Create a custom class named CydeoStudent with the following specifications:
//
//	Attributes:
//			name
//			age
//			id
//			grade
//			batchNumber
//			groupNumber
//			schoolName (static)
//			programmingLanguage (static)
//
//	Constructors:
//			Add a constructor that can set all the fields
//
//	Actions:
//		study(): displays the name of the Cydeo student on the console with the concatenated message "is studying."
//		attendClass(): displays the name of the Cydeo student on the console with the concatenated message "is attending the live class."
//		printSchoolName(): displays the school name
//		printProgLanguage(): displays the name of the programming language
//		toString(): returns a string representation of the CydeoStudent object.
//
//
//	Create another class named CydeoStudentClients, create multiple CydeoStudent objects, and test each function of the CydeoStudent object.

public class CydeoStudent {
    public String name;
    public int age;
    public String id;
    public String grade;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public static String programmingLanguage;

    public CydeoStudent(String name, int age, String id, String grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study (){
        System.out.println(name + " is studying.");
    }
    public void attendClass(){
        System.out.println(name + " is attending the live class.");
    }
    public static void  printSchoolName(){
        System.out.println("School Name: " + schoolName);
    }
    public static void printProgLanguage(){
        System.out.println("Programming Language: " + programmingLanguage);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", grade='" + grade + '\'' +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
