package Lection06.online.HomeWork06;

public class Cat extends Animal{

    public static int countCat = 0;
    public static String typeClass = "�����";

    Cat(String name, int run, int swim) {
        super(typeClass, name, run, swim);
        ++countCat;
    }

}


