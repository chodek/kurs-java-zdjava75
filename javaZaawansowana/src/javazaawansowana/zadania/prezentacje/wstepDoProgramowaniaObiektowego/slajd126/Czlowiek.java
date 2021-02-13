package javazaawansowana.zadania.prezentacje.wstepDoProgramowaniaObiektowego.slajd126;

public abstract class Czlowiek {

    protected String imie;
    protected String nazwisko;

    public Czlowiek(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
}
