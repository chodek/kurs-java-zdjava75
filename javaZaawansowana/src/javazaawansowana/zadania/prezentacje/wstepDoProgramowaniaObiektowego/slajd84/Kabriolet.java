package javazaawansowana.zadania.prezentacje.wstepDoProgramowaniaObiektowego.slajd84;

public class Kabriolet extends Samochod {

    private boolean czyDachSchowany;

    public Kabriolet(String marka, String kolor, int rocznik, double predkosc, boolean swiatla, boolean czyDachSchowany) {
        super(marka, kolor, rocznik, predkosc, swiatla);
        this.czyDachSchowany = czyDachSchowany;
    }

    @Override
    public String toString() {
        return super.toString() + " z rozsuwanym dachem";
    }

    @Override
    public void przyspiesz() {
        if (this.predkosc <= 170) {
            predkosc += 10;
            System.out.println("Przyspieszam do: " + predkosc);
        } else {
            System.out.println("Sory, ale szybciej niz 180 nie moge");
        }
    }

    public void schowajDach() {
        if (czyDachSchowany) {
            System.out.println("Dach jest juz schowany");
        } else {
            czyDachSchowany = true;
        }
    }

    protected boolean czyDachSchowany() {
        return czyDachSchowany;
    }


}
