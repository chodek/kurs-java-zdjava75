package javazaawansowana.zadania.prezentacje.slajd84;

public class Kabriolet extends Samochod {

    private boolean czyDachSchowany;


    @Override
    public String toString() {
        return "Kabrolet{predkosc: " + predkosc + ", swiatla: " + swiatla + "}";
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
