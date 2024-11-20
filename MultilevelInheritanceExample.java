class Vehicle {
    protected String brand;
    protected int year;

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
class ElectricCar extends Car {
    private double batteryCapacity;

    public ElectricCar(String brand, int year, int numDoors, double batteryCapacity) {
        super(brand, year, numDoors);
        this.batteryCapacity = batteryCapacity;
    }

    public void displayElectricCarDetails() {
        displayCarDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("Tesla", 2022, 4, 75.0);
        electricCar.displayElectricCarDetails();
    }
}