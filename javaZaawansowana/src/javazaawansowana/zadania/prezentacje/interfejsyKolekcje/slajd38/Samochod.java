package javazaawansowana.zadania.prezentacje.interfejsyKolekcje.slajd38;

import java.util.Objects;

public class Samochod {

    String marka;
    String model;
    String kolor;

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

    public void zmienKolor(String kolor){
        this.kolor = kolor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Samochod samochod = (Samochod) o;
        return Objects.equals(marka, samochod.marka) && Objects.equals(model, samochod.model) && Objects.equals(kolor, samochod.kolor);
    }


}
