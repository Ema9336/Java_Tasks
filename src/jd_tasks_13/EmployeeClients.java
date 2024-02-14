package jd_tasks_13;
//3. Create a class named "EmployeeClients":
//   - Create multiple objects representing different employees.
//   - Test the methods and attributes of each object.
public class EmployeeClients {

    public static void main(String[] args) {

        Tester tester = new Tester("A9337", "SDET", 120_000,
                "Google");

        tester.work("Ema Jovanova");
        System.out.println(tester);

        System.out.println("----------------------------");

        Developer developer = new Developer("B3909","Java developer", 160_000,
                "Google", "Java");

        developer.work("Ratko Mitev");
        System.out.println(developer);

        System.out.println("----------------------------");

        Teacher teacher = new Teacher("A334", "QA", 120_000,
                "Amazon");

        teacher.work("Filip Jovanovski");
        System.out.println(teacher);

        System.out.println("---------------------------");

        Driver driver = new Driver("A1212", "Truck Driver", 180_000,
                "Ratko M. company");
        driver.work("Ratko M.");
        System.out.println(driver);

    }

}
