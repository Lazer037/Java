import java.util.Scanner;

public class AlternateNumberPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alternate Number Printer");
        System.out.println("---------------------------");

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Alternate numbers:");
        printAlternateNumbers(array);
    }
    public static void printAlternateNumbers(int[] array) {
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
    }
}