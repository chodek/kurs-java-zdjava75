package pl.sda.javazaawansowana.pokaz.IO.serializacja;


import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Movie movieToSerialize = new Movie(new Director("dzordz","lukas"),"Star Wars", "Star Wars III", 2001);
        System.out.println(movieToSerialize);
        System.out.println(movieToSerialize);

        serializeMovie(movieToSerialize);

        Movie newMovie = deserializeMovie();
        System.out.println("nowy film to: " + newMovie);
        System.out.println(newMovie.equals(movieToSerialize));
    }

    private static void serializeMovie(Movie movieToSerialize) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("movies.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);

        out.writeObject(movieToSerialize);
        fileOutputStream.close();
        out.flush();
        out.close();
    }

    private static Movie deserializeMovie() throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("movies.txt");
        ObjectInputStream in = new ObjectInputStream(fileIn);

        Movie movieDeserialized = (Movie) in.readObject();
        in.close();
        fileIn.close();
        return movieDeserialized;

    }
}
