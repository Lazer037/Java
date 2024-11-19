public class Student {
    private String name;
    private int age;
    public Student() {
        System.out.println("Zero-arguments constructor called");
        name = "Unknown";
        age = 0;
    }
    public Student(String name, int age) {
        System.out.println("Parameterized constructor called");
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.displayInfo();
        Student student2 = new Student("John Doe", 25);
        student2.displayInfo();
    }
}