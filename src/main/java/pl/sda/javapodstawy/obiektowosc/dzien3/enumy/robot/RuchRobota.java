package pl.sda.javapodstawy.obiektowosc.dzien3.enumy.robot;

public enum RuchRobota {

    KROK_LEWA(10),
    KROK_PRAWA(7),
    BRAK(0);

    private int zuzycieEnergi;

    public int getZuzycieEnergi() {
        return zuzycieEnergi;
    }

    RuchRobota(int zuzycieEnergi) {
        this.zuzycieEnergi = zuzycieEnergi;
    }
}
