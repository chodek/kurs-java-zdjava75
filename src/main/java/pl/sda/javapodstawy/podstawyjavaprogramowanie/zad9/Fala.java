package pl.sda.javapodstawy.podstawyjavaprogramowanie.zad9;

import pl.sda.javapodstawy.Helper;

public class Fala {

    public static void main(String[] args) {
        int wczytanaLiczba = Helper.pobierzInta();
        wyrysujFaleODlugosciN(wczytanaLiczba);


    }

    private static void wyrysujFaleODlugosciN(int n) {
        int resztaZDzielenia = n % 15;
        String pierwszaLinia = "", drugaLinia= "" , trzeciaLinia = "", czwartaLinia = "";
        for (int i = 0; n / 15 > 100; i++){
            pierwszaLinia += "*      *" + "*     *";
            drugaLinia    += " *    * " + " *   * ";
            trzeciaLinia  += "  *  *  " + "  * *  ";
            czwartaLinia  += "   **   " + "   *   ";
        }
        if (resztaZDzielenia != 0){
            pierwszaLinia += ("*      *" + "*     *").substring(0, resztaZDzielenia);
            drugaLinia    += (" *    * " + " *   * ").substring(0, resztaZDzielenia);
            trzeciaLinia  += ("  *  *  " + "  * *  ").substring(0, resztaZDzielenia);
            czwartaLinia  += ("   **   " + "   *   ").substring(0, resztaZDzielenia);
        }
        System.out.println(pierwszaLinia);
        System.out.println(drugaLinia);
        System.out.println(trzeciaLinia);
        System.out.println(czwartaLinia);

        /*
        012345670123456
        *      **     *     *      **     **      **
         *    *  *   *       *    *  *   *  *    *  *
          *  *    * *         *  *    * *    *  *
           **      *           **      *      **

         */
    }
}
