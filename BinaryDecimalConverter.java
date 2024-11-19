import java.util.Scanner;

public class BinaryDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Binary-Decimal Converter");
        System.out.println("---------------------------");

        while (true) {
            System.out.println("1. Binary to Decimal");
            System.out.println("2. Decimal to Binary");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a binary number: ");
                    String binary = scanner.next();
                    int decimal = binaryToDecimal(binary);
                    System.out.println("Decimal equivalent: " + decimal);
                    break;
                case 2:
                    System.out.print("Enter a decimal number: ");
                    int decimalInput = scanner.nextInt();
                    String binaryResult = decimalToBinary(decimalInput);
                    System.out.println("Binary equivalent: " + binaryResult);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int base = 1;
        for (int i = binary.length() - 1; i >= 0; i--) {
            decimal += (binary.charAt(i) - '0') * base;
            base *= 2;
        }
        return decimal;
    }
    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        return binary.toString();
    }
}