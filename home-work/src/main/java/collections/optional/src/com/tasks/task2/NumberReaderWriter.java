package collections.optional.src.com.tasks.task2;

import java.util.Scanner;

public class NumberReaderWriter {

    public void toReadWriteNumber() {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        String selectedNumber = (scanner.nextLine());
        String[] masOfSelectedNum = selectedNumber.split("");
        int[] intMasOfSelectedNum = new int[masOfSelectedNum.length];
        for (int i = 0; i < masOfSelectedNum.length; i++) {
            intMasOfSelectedNum[i] = Integer.parseInt(masOfSelectedNum[i]);
        }
        for (int i = intMasOfSelectedNum.length - 1; i >= 0; i--) {
            System.out.print(intMasOfSelectedNum[i]);
        }
    }
}
