class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

import java.util.Scanner;

public class AgeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            validateAge(name, age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void validateAge(String name, int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Invalid age for " + name + ". Age cannot be negative.");
        }

        System.out.println(name + " is " + age + " years old.");
    }
}