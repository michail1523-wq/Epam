package optional_2;

import java.util.Scanner;

public class OptionalTask_1 {

    public static void main(String[] args) {


        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] mas = s.split(" ");
        int maxLength = 0;
        int[][] matrix = new int[Integer.parseInt(mas[0])][Integer.parseInt(mas[1])];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * (200 + 1)) - 100;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (maxLength < matrix[i][j]) {
                    maxLength = matrix[i][j];
                }
            }

        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (maxLength == matrix[i][j]) {
                    for (int n = 0; n < matrix.length; n++) {
                        if (maxLength != matrix[n][j]) {
                            matrix[n][j] = 0;
                        }
                    }
                    for (int m = 0; m < matrix[i].length; m++) {
                        if (maxLength != matrix[i][m]) {
                            matrix[i][m] = 0;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
