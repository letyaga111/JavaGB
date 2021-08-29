import java.util.Random;

public class HomeWork_03 {
        public static Random random = new Random();

        public static void main(String[] args) {

            // Задание 1
            System.out.println("Задание 1");
            int[] array1 = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            changeZeroOne(array1);
            printArray(array1);

            // Задание 2
            System.out.println("Задание 2");
            int[] array2 = new int[100];
            fillArray(array2);
            printArray(array2);

            // Задание 3
            System.out.println("Задание 3");
            int[] array3 = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            changeSix(array3);
            printArray(array3);

            // Задание 4
            System.out.println("Задание 4");
            int arrayDimension = 8;   // Размер квадратного массива
            int[][] array4 = new int[arrayDimension][arrayDimension];
            fillDiagArray(array4);
            printArray(array4);

            // Задание 5
            System.out.println("Задание 5");
            printArray(fillSimpleArray(5, 123));

            // Задание 6
            System.out.println("Задание 6");
            int[] arrayMinMax = new int[20];
            randomFillArray(arrayMinMax, 100);
            printArray(arrayMinMax);        // Вывод массива для визуального контроля правильности работы метода
            findMinMax(arrayMinMax);

            // Задание 7
            System.out.println("Задание 7");
            int[] arrayBalance = {2, 2, 2, 1, 2, 2, 10, 1};
            System.out.println(checkBalance(arrayBalance));

            // Задание 8
            System.out.println("Задание 8");
            int[] array8 = {1,2,3,4,5};
            printArray(array8);
            moveArray(array8, -4);
            printArray(array8);
        }

        public static void changeZeroOne(int[] inputArr) {  // Задание 1
            for (int i = 0; i < inputArr.length; i++) {
                if (inputArr[i] == 0) {
                    inputArr[i] = 1;
                } else {
                    inputArr[i] = 0;
                }
            }
        }

        public static void fillArray(int[] inputArr) {      // Задание 2
            for (int i = 0; i < inputArr.length; i++) {
                inputArr[i] = i + 1;
            }
        }

        public static void printArray(int[] inputArr) {     // Печать одномерного массива на экран
            for (int i = 0; i < inputArr.length; i++) {
                System.out.print(inputArr[i] + " ");
            }
            System.out.println();
        }

        public static void printArray(int[][] inputArr) {     // Печать двумерного массива на экран
            for (int i = 0; i < inputArr.length; i++) {
                for (int j = 0; j < inputArr.length; j++) {
                    System.out.print(inputArr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        public static void changeSix(int[] inputArr) {      // Задание 3 - удвоить элементы меньше 6
            for (int i = 0; i < inputArr.length; i++) {
                if (inputArr[i] < 6) {
                    inputArr[i] *= 2;
                }
            }
        }

        public static void fillDiagArray(int[][] inputArr) {    // Задание 4 - заполнить диагонали квадратного массива единицами
            for (int i = 0; i < inputArr.length; i++) {
                inputArr[i][i] = 1;
                inputArr[i][inputArr.length - 1 - i] = 1;
            }
        }

        public static int[] fillSimpleArray(int len, int initialValue) {    // Задание 5 - создание одномерного массива из метода
            int[] tempArray = new int[len];
            for (int i = 0; i < len; i++) {
                tempArray[i] = initialValue;
            }
            return tempArray;
        }

        public static void randomFillArray(int[] inputArr, int value) {  // Заполнение массива рандомными значениями в диапазоне [0, value)
            for (int i = 0; i < inputArr.length; i++) {
                inputArr[i] = random.nextInt(value);
            }
        }

        public static void findMinMax(int[] inputArr) {      // Поиск минимального и максимального значения в таблице
            int min = inputArr[0];                           // Минимальный элемент
            int minPos = 0;                                  // Позиция минимального элемента
            int max = inputArr[0];                           // Максимальный элемент
            int maxPos = 0;                                  // Позиция максимального элемента
            for (int i = 1; i < inputArr.length; i++) {
                if (inputArr[i] < min) {
                    min = inputArr[i];
                    minPos = i;
                }
                if (inputArr[i] > max) {
                    max = inputArr[i];
                    maxPos = i;
                }
            }
            System.out.println("Минимальный элемент массива - " + min + ", имеет индекс " + minPos);
            System.out.println("Максимальный элемент массива - " + max + ", имеет индекс " + maxPos);
        }

        public static boolean checkBalance(int[] inputArr) {    // Задание 7. Считаем сумму слева и сумму справа.
            int sumLeft = inputArr[0];                          // Принимаем 0-й элемент как изначальную сумму слева.
            int sumRight = inputArr[inputArr.length - 1];       // Принимаем крайний справа элемент как изначальную сумму справа.
            int i = 1;                                          // Дальнейшие действия с 1 индекса слева...
            int j = inputArr.length - 2;                        // ...и предпоследнего индекса справа.
            while (i <= j) {                                    // Пока индекс слева <= индексу справа
                if (sumLeft <= sumRight) {                      // то если сумма слева <= сумме справа
                    sumLeft += inputArr[i];                     // прибавляем к сумме слева значение элемента с индексом i
                    i++;                                        // и увеличиваем индекс i.
                } else {                                        //
                    sumRight += inputArr[j];                    // Иначе прибавляем к сумме справа элемент с индексом j
                    j--;                                        // и уменьшаем индекс j.
                }
            }                                                   // В итоге, если в точке встречи индексов суммы слева и справа
            return sumLeft == sumRight;                         // будут равны, то условие выполняется.
        }

        public static void moveArray(int[] inputArr, int movePosition) {    // Задание 8
            if (movePosition < 0) {                         // Если требуется сдвигать влево (на отрицательное значение,
                movePosition += inputArr.length;            // то двигаем вправо на значение "длина массива + размер сдвига".
            }
            for (int i = 0; i < movePosition; i++) {
                moveRight(inputArr);
            }
        }

        public static void moveRight(int[] inputArr) {      // Смещение элементов массива вправо на 1 позицию.
            int temp = inputArr[inputArr.length - 1];
            for (int j = inputArr.length - 1; j > 0; j--) {
                inputArr[j] = inputArr[j - 1];
            }
            inputArr[0] = temp;
        }

    }
