package labaCourseMaterial;

public class Main {
    public static long dailySalary = 2000;
    public static long dailyOvertimePay = 1000;
    public static long dailyPremium = 3000;

    public static void main(String[] args) {
        System.out.println("\nÇalışan 1; ");
        Employee employee = new Employee();
        employee.addEmployee(1, "Ahmet", "İshakoğlu");
        employee.logEmployeeNameAndSurname();
        calculateTotalSalary(employee, 18);
        employee.logEmployeeTotal();

        System.out.println("\nÇalışan 2; ");
        Employee employee2 = new Employee();
        employee2.addEmployee(2, "Yılmaz", "İshakoğlu");
        employee2.logEmployeeNameAndSurname();
        calculateTotalSalary(employee2, 24);
        employee2.logEmployeeTotal();

        System.out.println("\nÇalışan 3; ");
        Employee employee3 = new Employee();
        employee3.addEmployee(2, "Yılmaz", "İshakoğlu");
        employee3.logEmployeeNameAndSurname();
        calculateTotalSalary(employee3, 28);
        employee3.logEmployeeTotal();

        System.out.println("\nÇalışan 4; ");
        Employee employee4 = new Employee();
        employee4.addEmployee(2, "Yılmaz", "İshakoğlu");
        employee4.logEmployeeNameAndSurname();
        calculateTotalSalary(employee4, 32);
        employee4.logEmployeeTotal();
    }

    /**
     * *
     * @param employee Çalışan Bilgilerinin bulunduğu obje
     * @param workedDays Çalıştığı gün sayısı (0 ile 31 arasında olmalıdır.)
     * @return Maaş, Mesai Ücreti ve Prim hesaplaması yapılıp çalışan objesine kaydedilir.
     */
    public static Employee calculateTotalSalary(Employee employee, int workedDays) {
        if (workedDays < 0 || workedDays > 31) {
            System.out.println("Çalıştığı gün sayısı 0 ile 31 arasında olmalıdır. Geçersiz.");
        } else {
            employee.workedDays = workedDays;
            employee.overtimePay = workedDays > 20 ? (workedDays - 20) * dailyOvertimePay : 0;
            employee.premium =  workedDays > 25 ? (workedDays - 25) * dailyPremium : 0;
            employee.salary = workedDays * dailySalary;
            employee.totalSalary = employee.salary + employee.overtimePay + employee.premium;
        }
        return employee;
    }
}