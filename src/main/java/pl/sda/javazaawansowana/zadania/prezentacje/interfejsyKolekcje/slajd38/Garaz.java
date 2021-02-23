package pl.sda.javazaawansowana.zadania.prezentacje.interfejsyKolekcje.slajd38;


public class Garaz<T> {

    private T lewy;
    private T prawy;

    public void zaparkuj(T auto) {
        if (lewy == null) {
            lewy = auto;
        } else if (prawy == null) {
            prawy = auto;
        } else {
            System.out.println("Sory, ale obydwa miejsca sa zajete, nie moge zaparkowac");
        }
    }

    public T wyprowadz(T auto) {
        if (auto.equals(lewy)) {
            lewy = null;
            return auto;
        } else if (auto.equals(prawy)) {
            prawy = null;
            return auto;
        } else {
            System.out.println("Nie znalazlem auta, zwracam null'a");
            return null;
        }
    }
}
