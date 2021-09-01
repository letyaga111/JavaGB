//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

public class Worker {

    private String name;
    private String surname;
    private String middleName;
    private String position;
    private String phone;
    private int salary;
    private int age;


//    2. Конструктор класса должен заполнять эти поля при создании объекта.
    public Worker(String name, String middleName, String surname, String position, String phone, int salary, int age) {
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    int getAge() {
        return age;
    }

//    3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    String getDetails() {
        return "Сотрудник: " + Worker.this.name + ' ' + Worker.this.middleName + ' ' + Worker.this.surname
                + ", должность: " + Worker.this.position + ", телефон: " + Worker.this.phone
                + ", зарплата: " + Worker.this.salary + ", возраст: " + Worker.this.age + '.';
    }



}
