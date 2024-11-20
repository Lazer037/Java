class Animal {
    public static void sound() {
        System.out.println("The animal makes a sound");
    }
}
class Dog extends Animal {
    public static void sound() {
        System.out.println("The dog barks");
    }
}

public class MethodHidingExample {
    public static void main(String[] args) {
        Animal.sound();
        Dog.sound();
        Animal animal = new Dog();
        animal.sound();
    }
}