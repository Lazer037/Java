import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digit Counter Program");
        System.out.println("------------------------");

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);
    }
    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }

        int digitCount = 0;
        while (number != 0) {
            number /= 10;
            digitCount++;
        }
        return digitCount;
    }
}