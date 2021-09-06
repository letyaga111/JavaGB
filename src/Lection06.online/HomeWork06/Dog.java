package Lection06.online.HomeWork06;

public class Dog extends Animal{

    public static int countDog = 0;
    public static String typeClass = "Собака";

    Dog(String name, int run, int swim) {
        super(typeClass, name, run, swim);
        ++countDog;
    }
}
