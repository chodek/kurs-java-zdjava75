package pl.sda.javapodstawy.metody;

import java.util.Random;

public class KlasaReturn {
    public static void main(String[] args) {



        System.out.println(zwrocLosowegoParzystegoInta(-10, 10));


    }


    public static int zwrocLosowegoParzystegoInta(int min, int max) { // zalozmy, ze min = 2 , a max = 9
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }



}
