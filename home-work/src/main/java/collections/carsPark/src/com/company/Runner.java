package collections.carsPark.src.com.company;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        TaxiPark taxiPark = new TaxiPark();
        Scanner scanner = new Scanner(System.in);
        System.out.println("To get the cost of cars enter 1");
        System.out.println("To sort cars by consumption enter 2");
        System.out.println("To get a sorted car by a speed range enter 3");
        Integer choiceOfCustomer = Integer.valueOf(scanner.nextLine());
        switch (choiceOfCustomer) {
            case 1:
                taxiPark.getCostOfAllCArs();
                break;
            case 2:
                taxiPark.getSortedCarsByFuelСonsumption();
                break;
            case 3:
                System.out.println("Enter a minimum value of range");
                Integer minValueOfRange = Integer.valueOf(scanner.nextLine());
                System.out.println("Enter a maximum value of range");
                Integer maxValueOfRange = Integer.valueOf(scanner.nextLine());
                System.out.println(taxiPark.getFitCarOfRange(minValueOfRange, maxValueOfRange));
                break;
            default:
                System.out.println("Your choice is incorrect");
        }
    }
}
