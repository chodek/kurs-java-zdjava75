package pl.sda.zdjavapol75.instrukcjewarunkowe;

public class If {

    public static void main(String[] args) {

        int wzrost = 180;

        if (wzrost < 140) {
            System.out.println("Jestes za niski! nie mozesz wejsc");
        } else if (wzrost > 250) {
            System.out.println("Jestes za wysoki");
        } else {
            System.out.println("Zapraszamy!");
        }

    }
}
