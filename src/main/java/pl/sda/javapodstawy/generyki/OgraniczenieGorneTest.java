package pl.sda.javapodstawy.generyki;

import java.util.List;

public class OgraniczenieGorneTest {

    public static double sum(List<? extends Number> numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void addIntegersOrAbove(List<? super Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
    }



    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3);
        System.out.println(sum(integerList));
    }



}
