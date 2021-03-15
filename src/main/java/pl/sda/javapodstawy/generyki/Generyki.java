package pl.sda.javapodstawy.generyki;

import pl.sda.javazaawansowana.zadania.prezentacje.wstepDoProgramowaniaObiektowego.slajd126.Autor;

public class Generyki {

    public static void main(String[] args) {
        System.out.println(abs(-10));

        Box<String> stringBox = new Box<>();
        stringBox.setItem("asdas");
    }


    public static <T extends Number> T abs(T number) {
        if (number instanceof Integer) {
            if (number.doubleValue() > 0) {
                return number;
            } else {
                return (T) new Integer(-number.intValue());
            }
        } else if (number instanceof Double) {
            if (number.doubleValue() > 0) {
                return number;
            } else {
                return (T) new Double(-number.doubleValue());
            }
        }
        return number;
    }
}
