class Student {
    private String name;
    private int rollNumber;
    private static int studentCount = 0; 
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        studentCount++; 
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
    public static void displayStudentCount() {
        System.out.println("Total Students: " + studentCount);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 101);
        Student student2 = new Student("Jane Doe", 102);
        student1.displayDetails();
        System.out.println();
        student2.displayDetails();
        System.out.println();
        Student.displayStudentCount();
    }
}