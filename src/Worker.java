//1. ������� ����� "���������" � ������: ���, ���������, email, �������, ��������, �������.

public class Worker {

    private String name;
    private String surname;
    private String middleName;
    private String position;
    private String phone;
    private int salary;
    private int age;


//    2. ����������� ������ ������ ��������� ��� ���� ��� �������� �������.
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

//    3. ������ ������ ���������� �������� �����, ������� ������� ���������� �� ������� � �������.
    String getDetails() {
        return "���������: " + Worker.this.name + ' ' + Worker.this.middleName + ' ' + Worker.this.surname
                + ", ���������: " + Worker.this.position + ", �������: " + Worker.this.phone
                + ", ��������: " + Worker.this.salary + ", �������: " + Worker.this.age + '.';
    }



}
