package javazaawansowana.zadania.prezentacje.interfejsyKolekcje.slajd13;

public class Main {

    public static void main(String[] args) {

        Telefon[] calaSiataTelefonow = new Telefon[100];

        for (int i = 0; i < calaSiataTelefonow.length; i++) {
            calaSiataTelefonow[i] = new Telefon();
        }

        for (Telefon telefon : calaSiataTelefonow) {
            telefon.zadzwon("555-333-123");
        }

        System.out.println("Dzwonie na numery alarmowe:");
        for (Telefon telefon : calaSiataTelefonow) {
            telefon.zadzwonNaNumerAlarmowy();
        }

        System.out.println("Laczne czasy rozmow wykonanych na kazdym z telefonow:");
        for (Telefon telefon : calaSiataTelefonow) {
            System.out.println(telefon.getLacznyCzasRozmow());
        }

        calaSiataTelefonow[1].zadzwonNaNumerAlarmowy();

    }
}
