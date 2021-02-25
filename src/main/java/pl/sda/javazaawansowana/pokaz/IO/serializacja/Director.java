package pl.sda.javazaawansowana.pokaz.IO.serializacja;

import lombok.Data;

import java.io.Serializable;

@Data
public class Director implements Serializable {

    private final String name;
    private final String surname;

}
