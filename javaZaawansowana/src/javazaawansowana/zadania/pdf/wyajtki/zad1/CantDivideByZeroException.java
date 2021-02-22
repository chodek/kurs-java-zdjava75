package javazaawansowana.zadania.pdf.wyajtki.zad1;

public class CantDivideByZeroException extends RuntimeException {

    public CantDivideByZeroException() {
        super("Nie mozesz dzielic przez 0");
    }

}
