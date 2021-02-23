package pl.sda.javapodstawy.obiektowosc.dzien3.enumy.robot;

public class Robot {

    private byte poziomEnergii;
    private String nazwaRobota;
    private boolean czyWlaczony;


    public Robot(String nazwaRobota) {
        this.nazwaRobota = nazwaRobota;
        this.poziomEnergii = 100;
        this.czyWlaczony = false;
    }

    public byte getPoziomEnergii() {
        return poziomEnergii;
    }

    public String getNazwaRobota() {
        return nazwaRobota;
    }

    public boolean isCzyWlaczony() {
        return czyWlaczony;
    }

    public void naladujRobota() {
        if (!czyWlaczony) {
            this.poziomEnergii = 100;
        }
    }

    public void wlaczRobota() {
        this.czyWlaczony = true;
        System.out.println("Wlaczam robota");
    }

    public void wylaczRobota() {
        this.czyWlaczony = false;
        System.out.println("Wylaczam robota");
    }

    public void poruszRobotem(RuchRobota ruchRobota) {
        if (czyWlaczony && poziomEnergii >= ruchRobota.getZuzycieEnergi() && ruchRobota != RuchRobota.BRAK) {
            poziomEnergii -= ruchRobota.getZuzycieEnergi();
            System.out.println("RUSZAM SIE: " + ruchRobota);
        }
    }


}
