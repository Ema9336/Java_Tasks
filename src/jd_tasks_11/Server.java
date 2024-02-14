package jd_tasks_11;
//Create a custom class named Server with similar specifications:
//
//	Attributes:
//			name (String)
//			employeeID (int)
//			hourlyRate (double)
//			fullTime (boolean)
//
//	Add A constructor that can set all the fields.
//
//    Actions:
//		takeOrder(): server's name + "is taking an order"
//	    cleanTable(): server's name + "is cleaning the table"
//		toString(): returns a string representation of a Chef, including full-time or part-time status

public class Server {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }
    public void takeOrder(){
        System.out.println(name + " is taking an order.");
    }

    public void cleanTable(){
        System.out.println(name + " is cleaning the table.");
    }

    @Override
    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }
}
