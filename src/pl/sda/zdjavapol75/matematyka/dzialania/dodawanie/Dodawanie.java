package pl.sda.zdjavapol75.matematyka.dzialania.dodawanie;

public class Dodawanie {

    public static void main(String args[]) {
        /*
        int a;
        int b;
        int c;
        zamiast tego, mozemy napisac tak:
        */

        int a = 1, b = 2, c = 3; // deklaracja z inicjalizacja 3 zmiennych tego samego typu

        /*
        to powyzej jest alternatywa dla tgo ponizej:
        a = 1;
        b = 2;
        c = 3;
        */

        System.out.println(a + 2);
        System.out.println(a + b);
        System.out.println(1 + 1);
        System.out.println(a + (b + c));

        c = a + b;

    }
}
