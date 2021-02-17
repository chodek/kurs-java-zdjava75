package javazaawansowana.zadania.prezentacje.interfejsyKolekcje.slajd57;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Kwadrat kwadrat = new Kwadrat(5);
        Kwadrat kwadrat1 = new Kwadrat(5);
        Prostokat prostokat = new Prostokat(5, 5);
        Prostokat prostokat1 = new Prostokat(2, 5);


        Set<Figura> figuraSet = new TreeSet<>(new Comparator<Figura>() {
            @Override
            public int compare(Figura o1, Figura o2) {
                if (o1.obliczPole() < o2.obliczPole()) {
                    return -1;
                } else if (o1.obliczPole() > o2.obliczPole()) {
                    return 1;
                } else {
                    if(o1.equals(o2)){
                        return 0;
                    } else {
                        return -1;
                    }
                }

                /* jednolinijkowa forma tego powyzej:
                return Double.compare(o1.obliczPole(), o2.obliczPole()) == 0 ? o1.equals(o2)? -1: Double.compare(o1.obliczPole(), o2.obliczPole()) : Double.compare(o1.obliczPole(), o2.obliczPole());
                 */
            }
        });
        figuraSet.add(kwadrat);
        figuraSet.add(kwadrat1);
        figuraSet.add(prostokat);
        figuraSet.add(prostokat1);
        System.out.println(figuraSet);


    }
}