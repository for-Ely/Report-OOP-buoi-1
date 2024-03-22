public class Employee {
    private String employeeName;
    private double basicSalary;
    private double salaryCoefficient;
    public final double SALARY_MAX = 20000;
    public static int count = 0;

    public void setEmployeeName(String s){
        employeeName = s;
    }
    public void setBasicSalary(double s){
        basicSalary = s;
    }
    public void setSalaryCoefficient(double s){
        salaryCoefficient = s;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public double basicSalary(){
        return basicSalary;
    }
    public double getSalaryCoefficien(){
        return salaryCoefficient;
    }



    public boolean increaseSalary(double ratio){
        salaryCoefficient += ratio;
        if (calculateSalary() <= SALARY_MAX){
            System.out.println("Increase " + employeeName + " salary successful");
            return true;
        }
        else{
            salaryCoefficient -= ratio;
            System.out.println("Increase " + employeeName + "salary failed");
            return false;
        }
    }
    public double calculateSalary(){
        return basicSalary*salaryCoefficient;
    }
    public void printInfo(){;
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + calculateSalary());

    }
    
    public Employee(String employeeName, double basicSalary, double salaryCoefficient){
        Employee.count += 1;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.salaryCoefficient = salaryCoefficient;
    }
    public int countTotalSalary(Employee... E) {
        int totalSalary = 0;
        for (Employee e: E) {
            totalSalary += e.calculateSalary();
        }
        return totalSalary;
    }
}
