class InvalidCredentialException extends Exception {
    public InvalidCredentialException(String message) {
        super(message);
    }
}
class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message);
    }
}

import java.util.Scanner;

public class AuthenticationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Re-enter password: ");
        String confirmPassword = scanner.nextLine();

        try {
            authenticateUser(username, password, confirmPassword);
        } catch (InvalidCredentialException | PasswordMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void authenticateUser(String username, String password, String confirmPassword) throws InvalidCredentialException, PasswordMismatchException {
        if (username.length() < 6) {
            throw new InvalidCredentialException("Username must be at least 6 characters long.");
        }

        if (!password.equals(confirmPassword)) {
            throw new PasswordMismatchException("Passwords do not match.");
        }

        System.out.println("User authenticated successfully.");
    }
}