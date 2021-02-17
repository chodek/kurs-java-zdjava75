package javazaawansowana.zadania.prezentacje.interfejsyKolekcje.slajd57;

import java.util.Objects;

public class Prostokat extends Figura {
    private double bokA, bokB;

    public Prostokat(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    double obliczPole() {
        return bokA * bokB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prostokat prostokat = (Prostokat) o;
        return Double.compare(prostokat.bokA, bokA) == 0 && Double.compare(prostokat.bokB, bokB) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bokA, bokB);
    }
}