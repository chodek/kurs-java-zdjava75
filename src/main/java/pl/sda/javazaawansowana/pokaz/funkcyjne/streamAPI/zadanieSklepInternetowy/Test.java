package pl.sda.javazaawansowana.pokaz.funkcyjne.streamAPI.zadanieSklepInternetowy;

import java.sql.SQLOutput;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Test {


    public static void main(String[] args) {

        Set<Computer> computerSet = new LinkedHashSet<>(List.of(
                new Computer("Asus", "Zenbook", "Snapdragon 888", 15.6, 2.1),
                new Computer("HP", "Pavilion", "Snapdragon 868", 11.6, 3.1),
                new Computer("Dell", "elitebook", "Intel Xeon", 15.6, 4.1),
                new Computer("Alienware", "gamiungowy", "Intel Core 5", 15.6, 5.1)
        ));

        String manufacturer = Helper.getStringFromUser("manufacturer");
        String model = Helper.getStringFromUser("model");
        String procesor = Helper.getStringFromUser("procesor");
        double screenDiagonal = Helper.getDoubleFromUser("przekatna ekranu");
        double waga = Helper.getDoubleFromUser("wage");


        computerSet.stream()
                .filter(x -> x.getManufacturer().equals(manufacturer))
                .filter(x -> x.getModel().equals(model))
                .filter(x -> x.getProcessor().equals(procesor))
                .filter(x -> x.getScreenDiagonal() == screenDiagonal)
                .filter(x -> x.getWeight() == waga)
                .forEach(System.out::println);
                // badz tak: .forEach(x -> System.out.println(x));


    }


}
