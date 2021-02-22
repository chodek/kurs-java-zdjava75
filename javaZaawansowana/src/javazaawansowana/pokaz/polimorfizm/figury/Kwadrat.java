package javazaawansowana.pokaz.polimorfizm.figury;

public class Kwadrat extends Prostokat {

    int bok = 5;

    public Kwadrat(double bokA) {
        super(bokA, bokA);
    }

    public void setBok(int bok) {
        validateBok(bok);
        this.bok = bok;
    }

    @Override
    public double obliczObwod() {
        return 4 * bokA;
    }

    public void przedstawKwadrat() {
        System.out.println("Hej, jestem kwadratem");
    }


    public void validateBok(int bok) {
        if (bok < 0) {
            throw new IllegalBokException(bok);
        }
        // inne operacje
    }
}
