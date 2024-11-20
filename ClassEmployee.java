import java.util.Scanner;
class Employee {
    private int empId;
    private String empName;
    private double basicSalary;
    private double grossSalary;

    public Employee(int empId, String empName, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
        this.grossSalary = calculateGrossSalary();
    }
    private double calculateGrossSalary() {
        double da = basicSalary * 0.2;
        double hra = basicSalary * 0.1;
        return basicSalary + da + hra;
    }
    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + grossSalary);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        System.out.print("Enter Employee Name: ");
        String empName = scanner.next();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        Employee employee = new Employee(empId, empName, basicSalary);
        employee.displayDetails();
    }
}