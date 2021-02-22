package javazaawansowana.pokaz.refleksja;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        // wyswietlMetodyKlasy();
        // wyswietlPolaKlasy();
        //uzyjJakichsMetodZKlasy();
        zmienPolaJakiejsKlasy();
    }

    public static void zmienPolaJakiejsKlasy() throws NoSuchFieldException, IllegalAccessException {
        Car car = new Car("Moj wlasny samochod", "Jeep");
        System.out.println(car);

        Field field = Car.class.getDeclaredField("name");
        field.setAccessible(true);
        field.set(car, "test");
        Field modelField = Car.class.getDeclaredField("model");
        modelField.setAccessible(true);
        modelField.set(car, "BMW");
        System.out.println("Set field using reflection: " + car);
    }

    public static void uzyjJakichsMetodZKlasy() throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        Class<?> carClass = Class.forName("javazaawansowana.pokaz.refleksja.Car");    // pobranie obiektu Class dla klasy Car
        Car car = (Car) carClass.newInstance();                                       // (1)
        Method setNameMethod = carClass.getDeclaredMethod("setName", String.class);   // (2)
        Method setModelMethod = carClass.getDeclaredMethod("setModel", String.class); // (3)
        Method getNameMethod = carClass.getDeclaredMethod("getName");                 // (4)
        setNameMethod.invoke(car, "Porsche");                                         // (5)
        setModelMethod.invoke(car, "K1");                                             // (6)
        System.out.println("Get name: " + getNameMethod.invoke(car));                 // (7)
        System.out.println("Use method using reflection: ");                          // (8)
        System.out.println(car);
    }

    public static void wyswietlMetodyKlasy() throws ClassNotFoundException {
        Class<?> carClass = Class.forName("javazaawansowana.pokaz.refleksja.Car");
        Method[] methods = carClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        methods = carClass.getDeclaredMethods();
        System.out.println("_______________________________________________________________________");
        for (Method method : methods) {
            System.out.println(method);
        }
    }

    public static void wyswietlPolaKlasy() throws ClassNotFoundException {
        Class<?> carClass = Class.forName("javazaawansowana.pokaz.refleksja.Car");
        Field[] fields = carClass.getDeclaredFields();



        for (Field field : fields) {
            System.out.println(field);
        }
    }
}
