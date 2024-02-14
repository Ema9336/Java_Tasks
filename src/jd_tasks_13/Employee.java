package jd_tasks_13;
//1. Create a subclass of Person named "Employee" with the following specifications:
//   Attributes:
//       - employeeId: String
//       - jobTitle: String
//       - salary: double
//       - companyName: String
//
//   Encapsulation:
//       - Same as previous tasks.
//
//   Constructor:
//       - Same as previous tasks.
//
//   Methods:
//       - work(): Displays the employee's job title and name.
//       - toString(): Returns a string representation of the Employee object.
public class Employee {
    private String employeeId;
    private String jobTitle;
    private double salary;
    private String company;

    public Employee(String employeeId, String jobTitle, double salary, String company) {
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
        setCompany(company);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        if (employeeId == null || employeeId.isEmpty() || employeeId.isBlank()) {
            System.err.println("Employee ID can not be null, empty or blank " + employeeId);
            System.exit(1);
        }
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        if (jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()) {
            System.err.println("Job title can not be null, empty or blank " + jobTitle);
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0){
            System.err.println("Salary can not be negative " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company == null || company.isEmpty() || company.isBlank()) {
            System.err.println("Company can not be null, empty or blank " + company);
            System.exit(1);
        }
        this.company = company;
    }
    public void work (String name){
        System.out.println(name + " is working in " + jobTitle );
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                '}';
    }
}
