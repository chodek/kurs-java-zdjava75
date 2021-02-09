package pl.sda.zdjavapol75;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Kwadratowe {

    public static void main(String[] args) {
        rownanieKwadratowe(wczytanaLiczba(),wczytanaLiczba(),wczytanaLiczba());

        Integer duzyInt = new Integer(1);

    }

    public static int wczytanaLiczba() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        return a;
    }

    public static void rownanieKwadratowe(int a, double b, int c) {
        double delta = Math.pow(b, 2) - 4 * (a * c);
        if (delta < 0) {
            System.out.println("delta ujemna");
        } else {
            double x1 = (-b - Math.sqrt(b)) / 2 * a;
            double x2 = (-b + Math.sqrt(b)) / 2 * a;
            System.out.println(x1 + " " + x2);
        }

    }
}
