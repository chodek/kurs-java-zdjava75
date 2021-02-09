package pl.sda.zdjavapol75.podstawyjavaprogramowanie.zad6;

import pl.sda.zdjavapol75.Helper;

public class Main {

    public static void main(String[] args) {
        System.out.println(obliczSumeSzeregu(Helper.pobierzInta()));
    }

    public static double obliczSumeSzeregu(int n) {
        double suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += 1.0 / i;
        }
        return suma;
    }
}
