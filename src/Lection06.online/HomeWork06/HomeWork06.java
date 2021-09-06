package Lection06.online.HomeWork06;

public class HomeWork06 {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", 200, 0);
        Cat cat2 = new Cat("Мурзик", 400, 0);
        Dog dog1 = new Dog("Тузик", 500, 10);
        Dog dog2 = new Dog("Бобик", 350, 5);

        Animal[] animals = {cat1, cat2, dog1, dog2};

        int runDistance = 200;
        int swimDistance = 50;

        String resultString;

        for (int i = 0; i < animals.length; i++) {
            resultString = animals[i].getType() + " " + animals[i].getName() + " может пробежать " + animals[i].getRunLimit() +
                    " м. Пытается пробежать " + runDistance + "м. ";
            if (animals[i].run(runDistance) == true) {
                resultString += "И пробегает!";
            } else {
                resultString += "И не пробегает!";
            }

            System.out.println(resultString);

            if (animals[i].getSwimLimit() != 0) {
                resultString = animals[i].getType() + " " + animals[i].getName() + " может проплыть " + animals[i].getSwimLimit() +
                        " м. Пытается проплыть " + swimDistance + "м. ";
                if (animals[i].swim(swimDistance) == true) {
                    resultString += "И проплывает";
                } else {
                    resultString += "И не проплывает!";
                }
                System.out.println(resultString);
            } else {
                System.out.println(animals[i].getType() + " " + animals[i].getName() + " не умеет плавать! ");
            }
        }
        System.out.println("Всего животных: " + Animal.count + ". Кошек: " + Cat.countCat + ". Собак: " + Dog.countDog);
    }

}
