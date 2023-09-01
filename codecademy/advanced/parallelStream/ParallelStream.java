package advanced.parallelStream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");

        // Create a List using readAllLines(), which reads all lines at once
        // Note: this will maintain the original ordering of the text
        List<String> textLineList = Files.readAllLines(file.toPath());

        System.out.println("[ Parallel streaming from list: ]");
        // Create parallel streams from List to print output
        textLineList.parallelStream().forEach(System.out::println);

        // Create a Stream of string type using lines(), which reads one line at a time from the text file
        // Note: this will maintain the original ordering of the text
        Stream<String> textLineStream = Files.lines(file.toPath());

        System.out.println("[ Parallel streaming from stream: ]");
        // Uses parallel() to create multiple streams to print output
        textLineStream.parallel().forEach(System.out::println);

        // Close the stream
        textLineStream.close();
    }
}
