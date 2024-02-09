package jd_tasks_06;
//4. Create a class named DayAndMonth:
//
//	3.1 Create a method named day that displays the day's name based on the given number.
//	If the number is invalid, print "Invalid Number".
//
//			Example:
//				day(5);
//
//			Output:
//				Friday
//
//	3.2 Create a method named monthName that displays the month's name based on the given number.
//	If the number is invalid, print "Invalid Number."
//
//
//			Example:
//				monthName(6);
//
//			Output:
//				June
//
//	3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
//	If the number is invalid, print "Invalid Number."
//
//				Example:
//					daysInMonth(6);
//
//				Output:
//					June has 30 days

public class DayAndMonth {
    public static void main(String[] args) {

        day(5);
        monthName(6);
        System.out.print("June has ");daysInMonth(6);

    }
    public static void day(int day){
        if (day>=1 && day <=7){
            System.out.println((day==1) ? "Monday": (day==2) ? "Tuesday" : (day== 3) ? "Wednesday" : (day == 4) ? "Thursday" :
                    (day == 5) ? "Friday" : (day == 6) ? "Saturday" : "Sunday"
            );
        } else {
            System.out.println("Invalid number");
        }
    }
    public static void monthName(int month) {
        String result= switch (month){
            case 1 -> "January";
            case 2-> "February";
            case 3-> "March";
            case 4 -> "April";
            case 5-> "May";
            case 6-> "June";
            case 7 -> "July";
            case 8-> "August";
            case 9-> "September";
            case 10 -> "October";
            case 11-> "November";
            case 12-> "December";
            default -> "No such a month";
        };
        System.out.println(result);
    }

    public static void daysInMonth(int month){
        switch (month){
            case 2:
                System.out.println("28 days");
                break;
            case 1,3,5,7,8,10,12:
                System.out.println("31 days");
                break;
            case 4,6,9,11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("Invalid month");
                break;

        }


    }

}
