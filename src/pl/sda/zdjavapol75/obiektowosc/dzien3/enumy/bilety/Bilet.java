package pl.sda.zdjavapol75.obiektowosc.dzien3.enumy.bilety;

public enum Bilet {
    ULGOWY_GODZINNY(2.0, 60),
    ULGOWY_CALODNIOWY(8.0, 1440),
    NORMALNY_GODZINNY(4.5, 60),
    NORMALNY_CALODNIOWY(12.0, 1440),
    BRAK_BILETU(0, 0);

    private double cena;
    private int czasJazdyWMinutach;

    Bilet(double cena, int czasJazdyWMinutach) {
        this.cena = cena;
        this.czasJazdyWMinutach = czasJazdyWMinutach;
    }

    public double pobierzCeneBiletu() {
        return cena;
    }

    public int pobierzCzasJazdy() {
        return czasJazdyWMinutach;
    }

    public void wyswietlDaneOBilecie() {
        System.out.println("Bilet " + this.name());
    }

    public static Bilet wyznaczBilet(int wiek, int czasJazdyWMinutach, double kwota) {
        if (wiek < 26) { // ulgowe
            if (czasJazdyWMinutach < 60) { // godzinne
                if (kwota >= ULGOWY_GODZINNY.pobierzCeneBiletu()) { // czy stac kogos na bilet
                    return ULGOWY_GODZINNY; // jak tak, to zwroc ten bilet,
                } else {
                    return BRAK_BILETU; // jak nie, to zwroc brak biletu
                }
            } else { // calodniowe
                if (kwota >= ULGOWY_CALODNIOWY.pobierzCeneBiletu()) { // czy stac kogos na bilet
                    return ULGOWY_CALODNIOWY; // jak tak, to zwroc ten bilet,
                } else {
                    return BRAK_BILETU; // jak nie, to zwroc brak biletu
                }
            }
        } else { // normalne

        }
        return BRAK_BILETU;
    }
}
