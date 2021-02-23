package pl.sda.javazaawansowana.zadania.prezentacje.interfejsyKolekcje.slajd13;

public interface Dzwoni {

    String nrAlarmowy = "999";

    void zadzwon(String numer);

    default void zadzwonNaNumerAlarmowy(){
        zadzwon(nrAlarmowy);
    }

    static void metodaStatycznaInterfejsuDzwoni(){
        System.out.println("Jestem metoda statyczna z interfejsu!");
    }

}
