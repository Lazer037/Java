import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = findSumOfConsecutiveDigits(number);
        System.out.println("Sum of numbers formed by consecutive digits: " + sum);
    }
    public static int findSumOfConsecutiveDigits(int number) {
        int sum = 0;
        String numStr = String.valueOf(number);

        for (int i = 0; i < numStr.length() - 1; i++) {
            String consecutiveDigits = numStr.substring(i, i + 2);
            sum += Integer.parseInt(consecutiveDigits);
        }

        return sum;
    }
}