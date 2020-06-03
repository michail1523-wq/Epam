package optional_1;

import java.util.Scanner;

public class OptionalTask_1 {


    public static void main(String[] args) {
        System.out.println("Enter some numbers");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int maxLength = 0;
        String minValue = null;
        String maxValue = null;
        int minLength = 1000000;
        String[] mas = s.split(" ");
        for (int i = 0; i < mas.length; i++) {
            if (maxLength < mas[i].length()) {
                maxLength = mas[i].length();
                maxValue = mas[i];
            }
            if (minLength > mas[i].length()) {
                minLength = mas[i].length();
                minValue = mas[i];
            }
        }
        System.out.println("Max Value is " + maxValue + " its length is " + maxLength);
        System.out.println("Min Value is " + minValue + " its length is " + minLength);
    }
}
