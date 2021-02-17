package javazaawansowana.zadania.prezentacje.interfejsyKolekcje.slajd38;

import java.util.Comparator;
import java.util.Objects;

public class Samochod implements Comparable {


    String marka; // V o l v o = 283
    String model; // X6 = 58
    String kolor;
    int rokProdukcji = 2000;

    public Samochod(String marka, String model, String kolor) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", kolor='" + kolor + '\'' +
                '}';
    }

    public void zmienKolor(String kolor) {
        this.kolor = kolor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Samochod samochod = (Samochod) o;
        return Objects.equals(marka, samochod.marka) && Objects.equals(model, samochod.model) && Objects.equals(kolor, samochod.kolor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, model, kolor);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
