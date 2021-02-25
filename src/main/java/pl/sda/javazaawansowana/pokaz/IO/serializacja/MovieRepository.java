package pl.sda.javazaawansowana.pokaz.IO.serializacja;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private final static Path PATH = Paths.get(".");
    private final static String FILE_NAME = "movies.txt";

    public void add(Movie movie) throws IOException, ClassNotFoundException {
        List<Movie> movies = readMovies();
        movies.add(movie);
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(movies);
        oos.flush();
        oos.close();
        fos.close();
    }

    public List<Movie> readMovies() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Movie> movies = (List<Movie>) ois.readObject();
        return movies;

    }

}
