package pl.sda.zdjavapol75.obiektowosc.dzien2.zadanieDomowe;

public class Main {
    public static void main(String[] args) {

        Zawodnik zawodnik1 = new Zawodnik(10.0, 20.0);
        Zawodnik zawodnik2 = new Zawodnik(5.0, 10.0);
        Zawodnik zawodnik3 = new Zawodnik(10.0, 30.0);

        Zawodnik[] zawodnicy = new Zawodnik[]{zawodnik1, zawodnik2, zawodnik3};


        int zwyciezca = -1;
        boolean ongoing = true;
        while (ongoing) {
            for (int i = 0; i < zawodnicy.length; i++) {
                zawodnicy[i].biegnijPrzezGodzine();
                if (zawodnicy[i].getDistance() > 50.0) {
                    ongoing = false;
                    zwyciezca = i;
                    break;
                }
            }
        }

        System.out.println("Wygral zawodnik " + zwyciezca + ", " + zawodnicy[zwyciezca].toString());

        System.out.println("Tabela wynikow:");
        for (int i = 0; i < zawodnicy.length; i++) {
            System.out.println(zawodnicy[i].toString());
        }

        StringBuilder sb = new StringBuilder();


    }
}
