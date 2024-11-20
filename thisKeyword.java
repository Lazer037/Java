class Employee {
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }
    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "John Doe", 50000.0);
        employee.displayDetails();
        employee.updateSalary(60000.0);
        employee.displayDetails();
    }
}