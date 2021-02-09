package pl.sda.zdjavapol75.obiektowosc.dzien2.zadanieDomowe;

import java.util.Random;

public class Zawodnik {
    private double minV;
    private double maxV;
    private double distance;

    public double getDistance() {
        return distance;
    }

    public Zawodnik(double minV, double maxV) {
        this.minV = minV;
        this.maxV = maxV;
    }

    @Override
    public String toString() {
        return "Zawodnik{" +
                "minV=" + minV +
                ", maxV=" + maxV +
                ", distance=" + distance +
                '}';
    }

    public void biegnijPrzezGodzine() {
        Random random = new Random();
        distance += random.nextDouble() * (maxV - minV) + minV;
    }
}
