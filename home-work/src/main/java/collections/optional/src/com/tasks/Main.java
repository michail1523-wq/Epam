package collections.optional.src.com.tasks;

import collections.optional.src.com.tasks.task1.Reader;
import collections.optional.src.com.tasks.task1.Writer;
import collections.optional.src.com.tasks.task2.NumberReaderWriter;

public class Main {

    public static void main(String[] args) {
        Reader reader = new Reader();
        reader.toReadfromFile();
        Writer writer = new Writer();
        writer.toWriteToFile(reader.toReadfromFile());
        NumberReaderWriter numberReaderWriter = new NumberReaderWriter();
        numberReaderWriter.toReadWriteNumber();

    }
}
