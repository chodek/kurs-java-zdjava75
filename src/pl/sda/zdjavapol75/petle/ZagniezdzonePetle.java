package pl.sda.zdjavapol75.petle;

public class ZagniezdzonePetle {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            for (int j = 1; j <= 10; j++) { // cala ta petla wypisze wiersz: 0 1 2 3 4 ...
                System.out.print(" " + j * i);
            }

            System.out.println(); // oddzielenie kolejnych wierszy

        }

        /*

         *
         **
         ***
         ****
         *****
         ******


         */

        for (int i = 0; i < 6; i++) { // ta petla zajmuje sie wypisaniem wiersza X razy

            for (int j = 0; j < i + 1; j++) { // ta petla zajmuje sie wypiasniem symbolu '*' X razy
                System.out.print('*');
            }
            System.out.println();

        }
    }
}
