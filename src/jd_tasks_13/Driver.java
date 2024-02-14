package jd_tasks_13;
//2.4 Driver:
//       - work(): Displays "[name] is driving".

public class Driver extends Employee{

    public Driver(String employeeId, String jobTitle, double salary, String company) {
        super(employeeId, jobTitle, salary, company);
    }

    @Override
    public void work (String name ){
        System.out.println(name + " is working");
    }
}