public class Employee {
    private String name;
    private int age;
    public Employee() {
        System.out.println("Zero-arguments constructor called");
        name = "Unknown";
        age = 0;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.displayInfo();
    }
}