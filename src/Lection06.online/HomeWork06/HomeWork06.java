package Lection06.online.HomeWork06;

public class HomeWork06 {

    public static void main(String[] args) {

        Cat cat1 = new Cat("������", 200, 0);
        Cat cat2 = new Cat("������", 400, 0);
        Dog dog1 = new Dog("�����", 500, 10);
        Dog dog2 = new Dog("�����", 350, 5);

        Animal[] animals = {cat1, cat2, dog1, dog2};

        int runDistance = 200;
        int swimDistance = 50;

        String resultString;

        for (int i = 0; i < animals.length; i++) {
            resultString = animals[i].getType() + " " + animals[i].getName() + " ����� ��������� " + animals[i].getRunLimit() +
                    " �. �������� ��������� " + runDistance + "�. ";
            if (animals[i].run(runDistance) == true) {
                resultString += "� ���������!";
            } else {
                resultString += "� �� ���������!";
            }

            System.out.println(resultString);

            if (animals[i].getSwimLimit() != 0) {
                resultString = animals[i].getType() + " " + animals[i].getName() + " ����� �������� " + animals[i].getSwimLimit() +
                        " �. �������� �������� " + swimDistance + "�. ";
                if (animals[i].swim(swimDistance) == true) {
                    resultString += "� ����������";
                } else {
                    resultString += "� �� ����������!";
                }
                System.out.println(resultString);
            } else {
                System.out.println(animals[i].getType() + " " + animals[i].getName() + " �� ����� �������! ");
            }
        }
        System.out.println("����� ��������: " + Animal.count + ". �����: " + Cat.countCat + ". �����: " + Dog.countDog);
    }

}
