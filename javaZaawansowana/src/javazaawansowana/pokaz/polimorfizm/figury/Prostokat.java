package javazaawansowana.pokaz.polimorfizm.figury;

public class Prostokat extends Figura {
    double bokA;
    double bokB;

    public Prostokat(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    public double obliczPole() {
        return bokA * bokB;
    }

    @Override
    public double obliczObwod() {
        return 2 * bokB + 2 * bokA;
    }

    public void przedstawProstokat() {
        System.out.println("Hej, jestem prostokatem");
    }
}
