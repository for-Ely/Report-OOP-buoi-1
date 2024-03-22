public class Testemployee {
    public static void main(String[] args) {
        Employee E1 = new Employee("Quan Sy", 5000L, 1.2);
        Employee E2 = new Employee("Shiori", 7000, 1.7);

        E1.printInfo();
        E1.increaseSalary(2.2);
        E1.printInfo();

        System.out.println();

        E2.printInfo();
        E2.increaseSalary(2);
        E2.printInfo();
    
        System.out.println(countTotalSalary(Employee E1, Employee E2));
    }
}