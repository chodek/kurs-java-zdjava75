package pl.sda.javapodstawy.metody;

public class KlasaZMetodami {

    public static void metodaStatyczna(){
        System.out.println("Jestem metoda Statyczna, to znaczy, ze wykonuje sie na klasie, a nie na obiekcie");
    }

    public void metodaNiestatyczna(){
        System.out.println("Jestem metoda Niestatyczna, to znaczy, ze wykonuje sie na obiekcie");
    }
}
