package pl.sda.javapodstawy.podstawyjavaprogramowanie.zad7;

import pl.sda.javapodstawy.Helper;

public class Fibonacci {

    public static void main(String[] args) {
        int n = Helper.pobierzInta();
        System.out.println(getNFibonnaciNumberFromTable(n));

    }

    public static int getNFibonnaciNumber(int n) {

        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
        // 1,1,2,3,5,8,13,21,33
    }

    public static int getNFibonnaciNumberFromTable(int n) {
        if (n <= 2) {
            return 1;
        }
        int[] fibTable = new int[n];
        fibTable[0] = 1;
        fibTable[1] = 1;

        for (int i = 2; i < n; i++) {
            fibTable[i] = fibTable[i - 1] + fibTable[i - 2];
        }

        return fibTable[n - 1];

    }
}
