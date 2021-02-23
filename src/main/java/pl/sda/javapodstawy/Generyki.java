package pl.sda.javapodstawy;

public class Generyki {

    public static void main(String[] args) {
        System.out.println(abs(-10));
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
