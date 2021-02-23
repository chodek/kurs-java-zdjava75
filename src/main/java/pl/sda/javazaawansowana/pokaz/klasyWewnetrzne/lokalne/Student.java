package pl.sda.javazaawansowana.pokaz.klasyWewnetrzne.lokalne;

public class Student {
    String imie;
    String nazwisko;

    public static void wypiszInformacjeOOcenach(String argument){
        class LocalClass {
            @Override
            public String toString() {

                return "Argumenty metody to: " + argument;
            }
        }
        LocalClass instancjaKlasyLokalnej = new LocalClass();
        System.out.println(instancjaKlasyLokalnej);

    }

    public static void main(String[] args) {


        wypiszInformacjeOOcenach("HAAHAHAH");
    }
}
