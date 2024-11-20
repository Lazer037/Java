public class Rectangle {
    private double length;
    private double width;
    public Rectangle() {
        System.out.println("No-argument constructor called");
        length = 0;
        width = 0;
    }
    public Rectangle(double side) {
        System.out.println("Single-argument constructor called");
        length = side;
        width = side;
    }
    public Rectangle(double length, double width) {
        System.out.println("Two-argument constructor called");
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Area of rectangle1: " + rectangle1.calculateArea());

        Rectangle rectangle2 = new Rectangle(5);
        System.out.println("Area of rectangle2: " + rectangle2.calculateArea());

        Rectangle rectangle3 = new Rectangle(4, 6);
        System.out.println("Area of rectangle3: " + rectangle3.calculateArea());
    }
}