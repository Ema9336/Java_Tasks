package jd_tasks_13;
//Create the following subclasses of Employee:
//   2.1 Tester:
//       - work(): Displays "[jobTitle] [name] is testing".
public class Tester extends Employee {
    public Tester(String employeeId, String jobTitle, double salary, String company) {
        super(employeeId, jobTitle, salary, company);
    }
    @Override
    public void work (String name) {
        System.out.println(getJobTitle() + " " + name + " is testing");
    }
}