package javazaawansowana.zadania.prezentacje.slajd84;

import java.util.Objects;

public class Samochod {

    protected String marka ="";
    protected String kolor="";
    protected String model="";
    protected double predkosc;
    protected boolean swiatla;



    @Override
    public String toString() {
        return "Samochod{predkosc: " + predkosc + ", swiatla: " + swiatla + "}";
    }

    private int tylkoMoje;

    public int getTylkoMoje() {
        return tylkoMoje;
    }

    public void setTylkoMoje(int tylkoMoje) {
        this.tylkoMoje = tylkoMoje;
    }

    public void przyspiesz() {
        if (predkosc <= 110) {
            predkosc += 10;
            System.out.println("Przyspieszam do " + predkosc);
        } else {
            System.out.println("Sory, szybciej niz 120 nie moge!");
        }
    }

    public void przelaczSwiatla() {
        swiatla = !swiatla;
    }

    protected boolean czySwiatlaWlaczone() {
        return swiatla;
    }
}
