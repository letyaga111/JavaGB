public class HomeWork2 {

    public static void main(String[] args) {

        // Задание 1 - Написать метод, принимающий на вход два целых числа и проверяющий,
        // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
        // в противном случае – false.
        System.out.println(checkSumm(5, 10));

        // Задание 2 - Написать метод, которому в качестве параметра передается целое число,
        // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        // Замечание: ноль считаем положительным числом.
        checkPositive(10);

        // Задание 3 - Написать метод, которому в качестве параметра передается целое число.
        // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        System.out.println(checkPositiveBool(-50));

        // Задание 4 - Написать метод, которому в качестве аргументов передается строка и число,
        //метод должен отпечатать в консоль указанную строку, указанное количество раз;
        printString("строка", 55);
        System.out.println();  // перевожу каретку на новую строку, т.к. в методе делаю вывод в одну строку

        // Задание 5 - Написать метод, который определяет, является ли год високосным,
        // и возвращает boolean (високосный - true, не високосный - false).
        System.out.println(checkLeapYear(2019));

    }

    // Задание 1
    public static boolean checkSumm(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // Задание 2
    public static void checkPositive(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    // Задание 3
    public static boolean checkPositiveBool(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }

    // Задание 4
    public static void printString(String st, int a) {
        for (int i = 1; i <= a; i++) {
            System.out.print(st + " ");
        }
    }

    // Задание 5
    public static boolean checkLeapYear(int a) {
        // Високосный - (делится на 4) И (не делится на 100) ИЛИ (делится на 400)
        if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}