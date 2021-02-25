package pl.sda.javazaawansowana.pokaz.IO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Cos {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("data.txt");
        Path pathToCopy = Paths.get("data_copy.txt");


        Files.delete(path);
        Files.createFile(path);

        Files.write(path, "test data\n".getBytes(), StandardOpenOption.WRITE);
        Files.write(path, "first linsadade\n".getBytes(), StandardOpenOption.APPEND); // APPEND dodaje tekst do istniejącej zawartości
        Files.write(path, "second line\n".getBytes(), StandardOpenOption.APPEND);

        /*for (String line : Files.readAllLines(path)){
            System.out.println(line);
        }*/


        List<String> wordList = new ArrayList<>();
        for (String readAllLine : Files.readAllLines(path)) {
            wordList.addAll(Arrays.asList(readAllLine.split(" ")));
        }
        wordList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -Integer.compare(o1.length(), o2.length());
            }
        });
        System.out.println(wordList.get(0));


        Files.list(Path.of(".")).forEach(System.out::println);

        Files.copy(path, pathToCopy);
        Files.delete(pathToCopy);
    }
}
