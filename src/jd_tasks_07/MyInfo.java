package jd_tasks_07;
// Create a class called MyInfo and ask the user to:
//
//      Enter your age (int)
//      Enter your gender (String - One word ONLY)
//      Enter your full name (String - Multiple words)
//      Enter your phone number (long)
//      Enter your zip code (int)
//      Enter your School name (String - Can be Multiple words)
//      Enter your city name (String - Can be Multiple words)
//      Enter your state name (String - One word ONLY)
//      Enter your building number (int)
//      Enter your Street name
//
//    Display all the inputs that the user entered in the following order in separate lines:
//
//        Full name
//        Age
//        Gender
//        Phone number
//        Address:
//             buildingNumber Street
//             City, state zipCode
import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner myInfo = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = myInfo.nextInt();

        System.out.println("Enter your gender ");
        String gender = myInfo.next();

        myInfo.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = myInfo.nextLine();

        System.out.println("Enter your phone number: ");
        long phoneNumber = myInfo.nextLong();

        System.out.println("Enter your zip code: ");
        int zipCode = myInfo.nextInt();

        System.out.println("Enter your School name: ");
        String schoolName = myInfo.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = myInfo.nextLine();

        System.out.println("Enter your state name: ");
        String stateName = myInfo.next();
        myInfo.nextLine();

        System.out.println("Enter your building number: ");
        int buildingName = myInfo.nextInt();

        System.out.println("Enter your Street name: ");
        String streetName = myInfo.nextLine();

        myInfo.close();

        System.out.println(fullName);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(phoneNumber);
        System.out.println("Address" +"\n\t" + buildingName + " " + streetName +
                cityName + ", " + " " + zipCode);


    }

}
