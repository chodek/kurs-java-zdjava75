package pl.sda.javazaawansowana.pokaz.IO.serializacja;

import java.io.IOException;
import java.util.Random;

public class MainRepository {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        MovieRepository movieRepository = new MovieRepository();

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            Movie movieToSerialize = new Movie(new Director("dzordz","lukas"),"Star Wars", "Star Wars III", random.nextInt());
            movieRepository.add(movieToSerialize);
        }


        System.out.println(movieRepository.readMovies());
    }
}
