package pl.sda.javazaawansowana.zadania.prezentacje.wstepDoProgramowaniaObiektowego.slajd84;


import java.util.Objects;

public class Samochod {

    protected final String marka;
    protected String kolor;
    protected int rocznik;
    protected double predkosc;
    protected boolean swiatla;


    public Samochod(String marka, String kolor, int rocznik, double predkosc, boolean swiatla) {
        this.marka = marka;
        this.kolor = kolor;
        this.rocznik = rocznik;
        this.predkosc = predkosc;
        this.swiatla = swiatla;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", kolor='" + kolor + '\'' +
                ", rocznik=" + rocznik +
                ", predkosc=" + predkosc +
                ", swiatla=" + swiatla +
                '}';
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Samochod samochod = (Samochod) o;
        return rocznik == samochod.rocznik && marka.equals(samochod.marka) && kolor.equals(samochod.kolor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, kolor, rocznik);
    }
}
