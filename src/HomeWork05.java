public class HomeWork05 {

    public HomeWork05() {
    }

    public static void main(String[] args) {

//        4. ������� ������ �� 5 �����������.
        Worker[] workerArray = new Worker[] {
                new Worker("������", "����", "��������",
                        "��������", "+7921-111-11-11", 100000, 50),
                new Worker("�������", "�������", "��������",
                        "��������", "+7911-222-22-22", 80000, 35),
                new Worker("������", "����", "��������",
                        "�������", "+7906-333-33-33", 60000, 46),
                new Worker("��������", "���������", "������������",
                        "�����������", "+7900-444-44-44", 50000, 38),
                new Worker("��������", "����", "��������",
                        "�����������", "+7999-555-55-55", 50000, 35)
        };

        getAllWorkers(workerArray);
        System.out.println("���������� ������ 40 ���:");
        getOldWorkers(workerArray, 40);
    }

    private static void getAllWorkers(Worker[] officeWorkers) {
        System.out.println("����������:");
        for(int i = 0; i < officeWorkers.length; ++i) {
            System.out.println(i + 1 + ". " + officeWorkers[i].getDetails());
        }
    }

//    5. � ������� ����� ������� ���������� ������ � ����������� ������ 40 ���.
    private static void getOldWorkers(Worker[] officeWorkers, int age) {
        for(int i = 0; i < officeWorkers.length; ++i) {
            if (officeWorkers[i].getAge() > 40) {
                System.out.println(officeWorkers[i].getDetails());
            }
        }

    }
}
