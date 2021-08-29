public class HomeWorkApp {

    public static void main(String[] args) {
        // Вызываем по порядку все три метода.
        printThreeWords();
        checkSummSign();
        printColor();
        compareNumbers();
    }

    // Задание 2
    public static void printThreeWords() {
        System.out.println("Задание 2");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();   // Отбивка строки
    }

    // Задание 3
    public static void checkSummSign() {
        System.out.println("Задание 3");
        int a = 5;
        int b = 5;
        System.out.println("Значения: a = " + a + ", b = " + b);
        int sum = a+b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        System.out.println();   // Отбивка строки
    }

    // Задание 4
    public static void printColor() {
        System.out.println("Задание 4");
        int value = 5;
        System.out.println("Значение: value = " + value);
        if (value <= 0) {
            System.out.println("Красный");
        } else {
            if ((value > 0) && (value <= 100)) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
        }
        System.out.println();   // Отбивка строки
    }

    // Задание 5
    public static void compareNumbers() {
        System.out.println("Задание 5");
        int a = 5;
        int b = 5;
        System.out.println("Значения: a = " + a + ", b = " + b);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
        System.out.println();   // Отбивка строки
    }
}
