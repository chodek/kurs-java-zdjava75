package pl.sda.javazaawansowana.pokaz.funkcyjne.streamAPI.zadanieSklepInternetowy;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Computer {
    private String manufacturer;
    private String model;
    private String processor;
    private double screenDiagonal;
    private double weight;
}
