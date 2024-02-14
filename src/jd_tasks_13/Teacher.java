package jd_tasks_13;
//2.3 Teacher:
//       - work(): Displays "[name] is teaching".
public class Teacher extends Employee {

    public Teacher(String employeeId, String jobTitle, double salary, String company) {
        super(employeeId, jobTitle, salary, company);
    }

    @Override
    public void work (String name) {

        System.out.println(name + " is teaching");
    }
}
