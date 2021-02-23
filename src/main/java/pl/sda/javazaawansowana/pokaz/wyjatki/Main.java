package pl.sda.javazaawansowana.pokaz.wyjatki;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        A();
    }


    public static void A() {
        B();
    }

    public static void B() {
        C();
    }

    public static void C() {


        try {
            sleep();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // a potem mozemy sobie dzialac dalej, a nie konczyc program
    }

    public static void sleep() throws FileNotFoundException {

        BufferedReader bufferedReader = null;

        bufferedReader = new BufferedReader(new FileReader("/tmp/sda.txt"));



        // tutaj dojdziemy jak kod z sekcji try nie rzuci wyjatku
    }

}
