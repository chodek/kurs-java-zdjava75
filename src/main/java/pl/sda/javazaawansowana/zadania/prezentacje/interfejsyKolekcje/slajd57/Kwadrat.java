package pl.sda.javazaawansowana.zadania.prezentacje.interfejsyKolekcje.slajd57;

import java.util.Objects;

public class Kwadrat extends Figura{
    private double bokA;

    public Kwadrat(double bokA) {
        this.bokA = bokA;
    }

    @Override
    double obliczPole() {
        return bokA *bokA;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kwadrat kwadrat = (Kwadrat) o;
        return Double.compare(kwadrat.bokA, bokA) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bokA);
    }
}
