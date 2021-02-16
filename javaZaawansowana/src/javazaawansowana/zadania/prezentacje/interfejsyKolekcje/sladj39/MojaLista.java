package javazaawansowana.zadania.prezentacje.interfejsyKolekcje.sladj39;

import java.util.Arrays;


public class MojaLista<E> {

    private E[] tablicaElementow;

    public MojaLista(int n) {
        this.tablicaElementow = (E[]) new Object[n];
    }

    public boolean dodaj(E element) {
        if(rozmiar() == tablicaElementow.length){
            powiekszTablice();
        }
        for (int i = 0; i < tablicaElementow.length; i++) {
            if (tablicaElementow[i] == null) {
                tablicaElementow[i] = element;
                return true;
            }
        }
        return false;
    }

    private void powiekszTablice() {
        tablicaElementow = Arrays.copyOf(tablicaElementow,tablicaElementow.length * 2 );
    }

    public int rozmiar() {
        int ileElementowNiePustych = 0;
        for (E e : tablicaElementow) {
            if (e != null) {
                ileElementowNiePustych++;
            }
        }
        return ileElementowNiePustych;
    }

    public boolean zawiera(E element) {
        for (E e : tablicaElementow) {
            if (element.equals(e)) {
                // null.equals(cos) - wywali wyjatek
                // cos.equals(null) - jest w porzadku
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "MojaLista" + Arrays.toString(tablicaElementow);
    }
}
