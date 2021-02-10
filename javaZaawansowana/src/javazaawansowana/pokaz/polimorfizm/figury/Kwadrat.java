package javazaawansowana.pokaz.polimorfizm.figury;

public class Kwadrat extends Prostokat {


    public Kwadrat(double bokA) {
        super(bokA, bokA);
    }



    @Override
    public double obliczObwod() {
        return 4 * bokA;
    }

    public void przedstawKwadrat() {
        System.out.println("Hej, jestem kwadratem");
    }
}
