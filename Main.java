import java.util.Scanner;
class ThreeDObject {
    public ThreeDObject() {}
    public double wholeSurfaceArea() {
        return 0; 
    }
    public double volume() {
        return 0; 
    }
}
class Box extends ThreeDObject {
    private double length, width, height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    public double volume() {
        return length * width * height;
    }
}
class Cube extends ThreeDObject {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double wholeSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}
class Cylinder extends ThreeDObject {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
class Cone extends ThreeDObject {
    private double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

    @Override
    public double volume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Box");
        System.out.println("2. Cube");
        System.out.println("3. Cylinder");
        System.out.println("4. Cone");
        int option = scanner.nextInt();

        ThreeDObject object = null;

        switch (option) {
            case 1:
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                System.out.print("Enter height: ");
                double height = scanner.nextDouble();
                object = new Box(length, width, height);
                break;
            case 2:
                System.out.print("Enter side: ");
                double side = scanner.nextDouble();
                object = new Cube(side);
                break;
            case 3:
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                System.out.print("Enter height: ");
                height = scanner.nextDouble();
                object = new Cylinder(radius, height);
                break;
            case 4:
                System.out.print("Enter radius: ");
                radius = scanner.nextDouble();
                System.out.print("Enter height: ");
                height = scanner.nextDouble();
                object = new Cone(radius, height);
                break;
            default:
                System.out.println("Invalid option");
                return;
        }
        System.out.println("Whole Surface Area: " + object.wholeSurfaceArea());
        System.out.println("Volume: " + object.volume());
    }
}