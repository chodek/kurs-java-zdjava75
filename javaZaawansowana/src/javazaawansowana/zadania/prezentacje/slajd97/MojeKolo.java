package javazaawansowana.zadania.prezentacje.slajd97;

public class MojeKolo extends Kolo {

    /* zad. 6.4 - nie da sie nadpisac konstruktora
    @Override
    public Kolo(final double promien){
        System.out.println("adadasdasdas");
    }
    */


    public MojeKolo(final double promien) {
        super(promien);
    }

    public void metodaTestujacaScenariusze() {
        // this.PI = 5.0; pola final nie mozna zmienic w klasie dziedziczacej - zad 6.1


    }



    /* zad. 6.2 - nie mozna nadpisac metody finalnej
    @Override
    public final double obliczPole(){
        return PI * promien;
    }
    */
}
