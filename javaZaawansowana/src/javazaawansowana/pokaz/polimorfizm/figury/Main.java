package javazaawansowana.pokaz.polimorfizm.figury;

public class Main {

    public static void main(String[] args) {

        Kwadrat kwadrat = new Kwadrat(2);
        Prostokat prostokat = kwadrat;
        Figura figura = prostokat;




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
