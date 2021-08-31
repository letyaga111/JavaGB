public class HomeWork05 {

    public HomeWork05() {
    }

    public static void main(String[] args) {

//        4. Создать массив из 5 сотрудников.
        Worker[] workerArray = new Worker[] {
                new Worker("Иванов", "Иван", "Иванович",
                        "директор", "+7921-111-11-11", 100000, 50),
                new Worker("Сидоров", "Евгений", "Петрович",
                        "менеджер", "+7911-222-22-22", 80000, 35),
                new Worker("Петров", "Петр", "Петрович",
                        "инженер", "+7906-333-33-33", 60000, 46),
                new Worker("Гладышев", "Александр", "Владимирович",
                        "программист", "+7900-444-44-44", 50000, 38),
                new Worker("Тестовый", "Тест", "Тестович",
                        "тестировщик", "+7999-555-55-55", 50000, 35)
        };

        getAllWorkers(workerArray);
        System.out.println("Сотрудники старше 40 лет:");
        getOldWorkers(workerArray, 40);
    }

    private static void getAllWorkers(Worker[] officeWorkers) {
        System.out.println("Сотрудники:");
        for(int i = 0; i < officeWorkers.length; ++i) {
            System.out.println(i + 1 + ". " + officeWorkers[i].getDetails());
        }
    }

//    5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
    private static void getOldWorkers(Worker[] officeWorkers, int age) {
        for(int i = 0; i < officeWorkers.length; ++i) {
            if (officeWorkers[i].getAge() > 40) {
                System.out.println(officeWorkers[i].getDetails());
            }
        }

    }
}
