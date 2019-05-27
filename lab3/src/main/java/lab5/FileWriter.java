package lab5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriter {

    private final String path;

    public FileWriter(String path) {
        this.path = path;
    }

    public void write(String str) {
        try {
            Files.write(Paths.get(path), str.getBytes());
        } catch (IOException e) {
            throw new RuntimeException("IO exception");
        }

    }
}
