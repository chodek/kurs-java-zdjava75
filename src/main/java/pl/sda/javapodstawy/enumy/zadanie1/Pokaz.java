package pl.sda.javapodstawy.enumy.zadanie1;

public class Pokaz {

    public static void main(String[] args) {

        System.out.println("Saturday is holiday: " + Weekday.SATURDAY.isHoliday());

        Weekday.TUESDAY.whichIsGreater(Weekday.FRIDAY);

    }
}



