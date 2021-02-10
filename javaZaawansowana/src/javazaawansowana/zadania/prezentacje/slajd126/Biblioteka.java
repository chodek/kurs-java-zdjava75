package javazaawansowana.zadania.prezentacje.slajd126;

import java.util.Arrays;

public class Biblioteka {

    protected Egzemplarz[] egzemplarzeWBibliotece;

    public Biblioteka() {
    }

    public Biblioteka(Egzemplarz[] egzemplarzeWBibliotece) {
        this.egzemplarzeWBibliotece = egzemplarzeWBibliotece;
    }

    public Egzemplarz[] getEgzemplarzeWBibliotece() {
        return egzemplarzeWBibliotece;
    }

    public void setEgzemplarzeWBibliotece(Egzemplarz[] egzemplarzeWBibliotece) {
        this.egzemplarzeWBibliotece = egzemplarzeWBibliotece;
    }


    public Egzemplarz[] szukajPoTytule(String tytul) {
        Egzemplarz[] poszukiwaneEgzemplarze = new Egzemplarz[egzemplarzeWBibliotece.length];
        int ileJuzZnaleziono = 0;
        if (egzemplarzeWBibliotece != null) {
            for (Egzemplarz egzemplarz : egzemplarzeWBibliotece) {
                if (egzemplarz.getTytul().equals(tytul)) {
                    poszukiwaneEgzemplarze[ileJuzZnaleziono++] = egzemplarz;
                }
            }
        }
        return Arrays.copyOf(poszukiwaneEgzemplarze, ileJuzZnaleziono);
    }
}
