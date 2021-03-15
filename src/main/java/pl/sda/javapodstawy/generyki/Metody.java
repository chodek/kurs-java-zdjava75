package pl.sda.javapodstawy.generyki;

public class Metody {

    public static void main(String[] args) {

        Box<String> stringBox = generujBoxa("cos do schowania");

        Box<Integer> integerBox = generujBoxa(123);

    }

    public static <T> Box<T> generujBoxa(T value) {
        Box<T> boxikTypuT = new Box<>();
        boxikTypuT.setItem(value);
        return boxikTypuT;
    }
}
