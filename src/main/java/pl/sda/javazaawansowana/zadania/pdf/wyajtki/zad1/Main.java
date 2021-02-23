package pl.sda.javazaawansowana.zadania.pdf.wyajtki.zad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(divide(5,1));
        System.out.println(divide(10,0));
    }


    public static double divide(int a, int b) {
        if (b == 0) {
            throw new CantDivideByZeroException();
        }
        return a / b;

    }

}

