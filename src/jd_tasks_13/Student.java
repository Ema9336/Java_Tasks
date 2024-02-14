package jd_tasks_13;
// Create a class named "Student" with the following specifications:
//   Attributes:
//       - name: String
//       - age: int
//       - gender: String
//
//   Encapsulation:
//       - Same as previous tasks.
//
//   Constructor:
//       - Same as previous tasks.
//
//   Actions:
//       - toString(): Prints the information of the Student object.
public class Student {
    private String name;
    private int age;
    private String gender;


    public Student(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name==null||name.isBlank()||name.isEmpty()){
            System.err.println("Name can not be null, blank or empty.");
            System.exit(1);
        }
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age<=0){
            System.err.println("Age con not be zero or negative.");
            System.exit(1);
        }
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        if (gender==null||gender.isBlank()||gender.isEmpty()){
            System.err.println("Gender can not be null, blank or empty.");
            System.exit(1);
        }
        this.gender = gender;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
