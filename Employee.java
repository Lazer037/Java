public class Employee {
    private String name;
    private int age;
    private double salary;
    public Employee(String name, int age, double salary) {
        System.out.println("Parameterized constructor called");
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", 30, 50000.0);
        employee1.displayInfo();
        Employee employee2 = new Employee("Jane Smith", 25, 60000.0);
        employee2.displayInfo();
    }
}