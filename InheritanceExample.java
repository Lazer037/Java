class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int year, int numDoors) {
        super(brand, year);
        this.numDoors = numDoors;
    }

    public void displayCarDetails() {
        displayDetails();
        System.out.println("Number of Doors: " + numDoors);
    }
}
class Truck extends Vehicle {
    private int capacity;

    public Truck(String brand, int year, int capacity) {
        super(brand, year);
        this.capacity = capacity;
    }

    public void displayTruckDetails() {
        displayDetails();
        System.out.println("Capacity: " + capacity);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022, 4);
        System.out.println("Car Details:");
        car.displayCarDetails();
        Truck truck = new Truck("Ford", 2020, 10);
        System.out.println("\nTruck Details:");
        truck.displayTruckDetails();
    }
}