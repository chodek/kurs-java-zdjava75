package pl.sda.javapodstawy.obiektowosc.dzien3;

public class Main {
    public static void main(String[] args) {

        Superbohater bohater1 = new Superbohater();
        Superbohater bohater2 = new Superbohater();
        Superbohater bohater3 = new Superbohater();

       bohater1 = null;
       bohater2 = bohater1;
       bohater1 = bohater3;

        System.out.println(bohater1 == null);
        System.out.println(bohater2 == null);
        System.out.println(bohater3 == null);
    }
}
