package pl.sda.javapodstawy.obiektowosc.dzien1.zadanieZeSlajdow;

public class Osoba {
    String imie;
    int rokUrodzenia;
    char plec;

    // tutaj tego nie widizmy, ale istnieje konstruktor domyslny, ktory tworzy obiekt, ale nie ustawia wartosci pol
    public Osoba() {
    }

    public Osoba(String imie, int rokUrodzenia, char plec) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
        this.plec = plec;
    }

    public void przedstawSie() {

        System.out.println("Czesc! Mam na imie " + imie + " i mam " + (2021 - rokUrodzenia) + " lat.");
    }


}
