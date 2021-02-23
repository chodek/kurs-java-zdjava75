package pl.sda.javazaawansowana.pokaz.kolekcje.mapy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Book[] booksTable = new Book[]{
                new Book("Odyseja kosmiczna", Genre.SCIFI),
                new Book("Odyseja kosmiczna 2", Genre.SCIFI),
                new Book("PRzygodowa", Genre.ADVENTURE),
                new Book("PRzygodowa2", Genre.ADVENTURE),
                new Book("Akcja ", Genre.ACTION),
                new Book("Akcja 2", Genre.ACTION)
        };

        Map<Genre, List<String>> booksMap = new HashMap<>();
        for (Book book : booksTable) {
            if (booksMap.containsKey(book.getGatunek())) {
                booksMap.get(book.getGatunek()).add(book.getTytul());
            } else {
                List<String> listaTytulow = new ArrayList<>();
                listaTytulow.add(book.getTytul());
                booksMap.put(book.getGatunek(), listaTytulow);
            }
        }

        System.out.println(booksMap);


    }


    public enum Genre {
        ACTION, SCIFI, ADVENTURE;
    }
}


class Book {
    private String tytul;
    private Main.Genre gatunek;

    public String getTytul() {
        return tytul;
    }

    public Main.Genre getGatunek() {
        return gatunek;
    }

    public Book(String tytul, Main.Genre gatunek) {
        this.tytul = tytul;
        this.gatunek = gatunek;
    }
}