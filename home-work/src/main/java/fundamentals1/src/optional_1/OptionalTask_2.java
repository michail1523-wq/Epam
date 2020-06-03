package optional_1;

import java.util.Arrays;
import java.util.Scanner;

public class OptionalTask_2 {


    public static void main(String[] args) {
        System.out.println("Enter some numbers");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String buf = null;
        String[] mas = s.split(" ");
        Boolean sort = false;
        while (!sort) {
            sort = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i].length() > mas[i + 1].length()) {
                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
