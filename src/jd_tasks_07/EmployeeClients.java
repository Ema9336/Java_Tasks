package jd_tasks_07;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.name = "Ema";
        employee1.age = 28;
        employee1.gender = 'F';
        employee1.jobTitle = "SDET";
        employee1.salary = 140.000;

        System.out.println("Name: " + employee1.name);
        System.out.println("Age: " + employee1.age);
        System.out.println("Gender: " + employee1.gender);
        System.out.println("Job Title: " + employee1.jobTitle);
        System.out.println("Salary: " + employee1.salary);

        employee1.work();

        System.out.println(employee1);

        Employee employee2 = new Employee();

        employee2.name = "Ratko";
        employee2.age = 30;
        employee2.gender = 'M';
        employee2.jobTitle = "SDET";
        employee2.salary = 160.000;

        System.out.println("Name: " + employee2.name);
        System.out.println("Age: " + employee2.age);
        System.out.println("Gender: " + employee2.gender);
        System.out.println("Job Title: " + employee2.jobTitle);
        System.out.println("Salary: " + employee2.salary);

        employee2.work();

        System.out.println(employee2);


    }
}
