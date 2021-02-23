package pl.sda.javazaawansowana.pokaz.polimorfizm.figury;

public class Main {

    public static void main(String[] args) {

        Kwadrat kwadrat = new Kwadrat(2);
        Prostokat prostokat = kwadrat;
        Figura figura = prostokat;

        kwadrat.setBok(10);
        kwadrat.setBok(-110);



        kwadrat.obliczPole();
        kwadrat.przedstawKwadrat();
        kwadrat.przedstawProstokat();
        kwadrat.przedstawFigure();

        prostokat.obliczPole();
        prostokat.przedstawProstokat();
        prostokat.przedstawFigure();

        figura.obliczPole();
        figura.przedstawFigure();

    }
}
