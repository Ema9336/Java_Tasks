package jd_tasks_11;

public class EmployeeClients {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ema", 28, 'F', "QA", 12000);
        employee1.work("Ema","QA");
        System.out.println(employee1);
        Employee employee2 = new Employee("Ratko", 33, 'M', "SDET", 10000);
        employee2.work("Ratko", "SDET");
        System.out.println(employee2);
    }
}
