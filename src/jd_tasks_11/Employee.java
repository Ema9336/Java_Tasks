package jd_tasks_11;
//3. Create a custom class named Employee with the following specifications:
//
//	Attributes:
//			name (String)
//			age (int)
//			gender (char)
//			jobTitle (String)
//			salary (double)
//
//    Constructors:
//			Add multiple constructors to set different fields of the employee object.
//
//    Actions:
//		work(): prints the job title and name of the employee concatenated with " is working."
//		toString(): returns a string representation of the employee object.
//
//	Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;


    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public Employee(int age) {
        this.age = age;
    }

    public Employee(char gender) {
        this.gender = gender;
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee (String name, int age, char gender, String jobTitle, double salary){
        this(name, jobTitle);
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public void work(String name, String jobTitle){
        System.out.println(jobTitle+ " " + name + " is working.");
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
