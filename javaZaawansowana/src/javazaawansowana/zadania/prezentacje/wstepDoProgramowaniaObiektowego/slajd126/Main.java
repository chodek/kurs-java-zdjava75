package javazaawansowana.zadania.prezentacje.wstepDoProgramowaniaObiektowego.slajd126;

public class Main {

    public static void main(String[] args) {
        Autor brzechwa = new Autor("Jan", "Brzechwa", "Bajki");
        Autor brzechwa2 = new Autor("Jan", "Brzechwa2", "Bajki");

        Ksiazka bajka1 = new Ksiazka(brzechwa,"Zbior bajek","bajka");
        Ksiazka bajka2 = new Ksiazka(brzechwa2,"bajki nie dla dzieci","bajka");

        Biblioteka bibliotekaMiejska = new Biblioteka(new Egzemplarz[]{bajka1, bajka2});


        for (Egzemplarz egzemplarz : bibliotekaMiejska.szukajPoTytule("bajki nie dla dzieci")) {
            System.out.println(egzemplarz);
        }



    }
}
