package jd_tasks_14;

import java.util.ArrayList;

public class CarShop {
    public static void main(String[] args) {

        Car[] cars = {
                new Honda("Pilot", "White", 2010, 25000),
                new Audi("Q6", "Red", 2014, 32000),
                new Honda("Accord", "White", 2011, 20000),
                new Audi("Q4", "Blue", 2015, 33000),
                new Audi("A7", "Black", 2019, 35000),
                new Audi("Q8", "White", 2018, 40000),
                new Audi("Q5", "Purple", 2009, 30000),
                new Audi("A4", "Black", 2011, 30000),
                new Honda("Civic", "Red", 2018, 30000),
                new Honda("CR-V", "Red", 2012, 23000),
                new Honda("HR-V", "Blue", 2019, 35000),
                new Tesla("Model 3", "White", 2015, 45000),
                new Tesla("Model Y", "Black", 2017, 65000),
                new Tesla("Model X", "White", 2016, 48000),
                new Tesla("Model X", "Blue", 2014, 48000),
        };


        displayCarsEligibleForRecall(cars);


        displayCarWithHighestPrice(cars);


        displayCarWithLowestPrice(cars);


        ArrayList<Tesla> teslaCars = createTeslaArrayList(cars);
    }


    private static void displayCarsEligibleForRecall(Car[] cars) {
        System.out.println("Cars eligible for recall:");
        for (Car car : cars) {
            if (car instanceof Honda && ((Honda) car).isEligibleForRecall()) {
                System.out.println(car);
            } else if (car instanceof Audi && ((Audi) car).isEligibleForRecall()) {
                System.out.println(car);
            } else if (car instanceof Tesla && ((Tesla) car).isEligibleForRecall()) {
                System.out.println(car);
            }
        }
        System.out.println();
    }


    private static void displayCarWithHighestPrice(Car[] cars) {
        Car highestPriceCar = cars[0];
        for (Car car : cars) {
            if (car.getPrice() > highestPriceCar.getPrice()) {
                highestPriceCar = car;
            }
        }
        System.out.println("Car with the highest price:");
        System.out.println(highestPriceCar);
        System.out.println();
    }


    private static void displayCarWithLowestPrice(Car[] cars) {
        Car lowestPriceCar = cars[0];
        for (Car car : cars) {
            if (car.getPrice() < lowestPriceCar.getPrice()) {
                lowestPriceCar = car;
            }
        }
        System.out.println("Car with the lowest price:");
        System.out.println(lowestPriceCar);
        System.out.println();
    }


    private static ArrayList<Tesla> createTeslaArrayList(Car[] cars) {
        ArrayList<Tesla> teslaCars = new ArrayList<>();
        for (Car car : cars) {
            if (car instanceof Tesla) {
                teslaCars.add((Tesla) car);
            }
        }
        System.out.println("ArrayList of Tesla cars:");
        for (Tesla teslaCar : teslaCars) {
            System.out.println(teslaCar);
        }
        return teslaCars;
    }
}
