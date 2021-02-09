package pl.sda.zdjavapol75.obiektowosc.dzien1.zadanieZeSlajdow;

public class Main {
    public static void main(String[] args) {

        Osoba osoba2 = new Osoba("Andrzej", 1950, 'm');
        Osoba osoba3 = new Osoba("Kamil", 2000, 'm');
        Osoba osoba4 = new Osoba("Michalina", 1990, 'k');

        Osoba[] tablicaOsob = new Osoba[3]; // tak robimy tablice na obiekty typu Osoba

        tablicaOsob[0] = osoba2;
        tablicaOsob[1] = osoba3;
        tablicaOsob[2] = osoba4;

        // tylko panowie
        System.out.println("Przedstawmy Panow:");
        for (int i = 0; i < tablicaOsob.length; i++) {
            if (tablicaOsob[i].plec == 'm') {
                tablicaOsob[i].przedstawSie();
            }
        }

        //tylko panie
        System.out.println("Teraz Panie:");
        for (int i = 0; i < tablicaOsob.length; i++) {
            if (tablicaOsob[i].plec == 'k') {
                tablicaOsob[i].przedstawSie();
            }
        }

    }
}
