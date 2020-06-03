package collections.optional.src.com.tasks.task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    List<String> textFromFile = new ArrayList<>();

    BufferedReader bufferedReader;
    File file;

    public List<String> toReadfromFile() {
        try {
            file = new File("dataTestFile.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedReader = new BufferedReader(new FileReader("dataTestFile.txt"));
            String st;
            while ((st = bufferedReader.readLine()) != null) {
                textFromFile.add(st);
            }

        } catch (IOException e) {
            System.out.println("Errors " + e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Errors " + e);
            }
        }
        return textFromFile;
    }
}