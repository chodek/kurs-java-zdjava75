package pl.sda.javazaawansowana.zadania.prezentacje.wstepDoProgramowaniaObiektowego.slajd97;

public class Kolo {

    protected final double PI = 3.14;
    protected double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }


    public final double obliczPole() {
        return PI * promien * promien;
    }

    public final double obliczPole(double PI){ // zad 6.3 - mozna przeciazyc metode finalna
        return PI * promien * promien;
    }

}
