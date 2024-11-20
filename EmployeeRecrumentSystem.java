class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}
class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

import java.util.Scanner;

public class EmployeeRecruitmentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter candidate name: ");
        String name = scanner.nextLine();

        System.out.print("Enter candidate age: ");
        int age = scanner.nextInt();

        try {
            checkAge(name, age);
        } catch (TooOlder | TooYounger e) {
            System.out.println(e.getMessage());
        }
    }
    public static void checkAge(String name, int age) throws TooOlder, TooYounger {
        if (age > 45) {
            throw new TooOlder("Too old! (" + age + ") Candidate name: " + name);
        } else if (age < 20) {
            throw new TooYounger("Too young! (" + age + ") Candidate name: " + name);
        } else {
            System.out.println("Eligible");
            System.out.println("Candidate name: " + name);
        }
    }
}