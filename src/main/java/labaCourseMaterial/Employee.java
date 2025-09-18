package labaCourseMaterial;

public class Employee {
    int id;
    String name;
    String surname;
    int workedDays;
    long salary;
    long overtimePay;
    long premium;
    long totalSalary;

    void addEmployee(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        workedDays = 0;
        salary = 0;
        overtimePay = 0;
        premium = 0;
        totalSalary = 0;
        System.out.println("Employee added.");
    }

    void logEmployeeNameAndSurname() {
        String employeeFullName = id + ". Çalışan : " + name + " " + surname;
        System.out.println(employeeFullName);
    }

    void logEmployeeTotal() {
        String employeeFullName = id + ". Çalışan : " + name + " " + surname;
        // System.out.println(employeeFullName);
        System.out.println("Çalıştığı Gün Sayısı: " + workedDays + " \n Maaşı: " + salary + " \n Mesai Ücreti: " + overtimePay + " \n Primi: " + premium);
        System.out.println("Toplam: " + totalSalary);
    }
}
