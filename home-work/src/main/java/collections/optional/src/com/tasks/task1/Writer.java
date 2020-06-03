package collections.optional.src.com.tasks.task1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Writer {

    public void toWriteToFile(List<String> textFromFile) {
        try {
            PrintWriter printWriter = new PrintWriter("dataTestFile.txt");
            for (int i = textFromFile.size() - 1; i >= 0; i--) {
                printWriter.println(textFromFile.get(i));
            }
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Errors " + e);
        }

    }
}
