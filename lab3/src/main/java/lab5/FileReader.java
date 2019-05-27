package lab5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class FileReader {

    private final String path;

    public FileReader(String path) {
        this.path = path;
    }

    public String read() {
        StringBuilder sb = new StringBuilder();
        try (Stream<String> stream = Files.lines(Paths.get(path))) {

            stream.forEach(s -> sb.append(s));

        } catch (IOException e) {
            throw new RuntimeException("IO exception");
        }
        return sb.toString();
    }

}
