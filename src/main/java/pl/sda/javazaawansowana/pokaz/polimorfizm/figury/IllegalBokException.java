package pl.sda.javazaawansowana.pokaz.polimorfizm.figury;

public class IllegalBokException extends IllegalArgumentException{

    public IllegalBokException(int bok) {
        super("Nieprawidlowa wartosc dla boku: " + bok);
    }
}
