package javazaawansowana.pokaz.dziedziczenie;


public class Car extends Vehicle {


    @Override
    public void startEngine(){
        super.startEngine();
        System.out.println("WRrrrrrrr. I am a sport car");
    }



    public void presentYourself(){
        System.out.println(this.name);
    }




}
