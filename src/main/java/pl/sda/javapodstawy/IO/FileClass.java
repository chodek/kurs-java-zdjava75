package pl.sda.javapodstawy.IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileClass {
    private Path path;
    boolean fileCreated = false;

    public FileClass(Path path) {
        this.path = path;
        createFile();
    }

    private void createFile() {
        try {
            Files.createFile(path);
            fileCreated = true;
        } catch (IOException e) {
            System.out.println("Cannot create file!");
        }
    }

    public FileClass(String fileName) {
        this.path = Paths.get(".");
        createFile();
    }
}