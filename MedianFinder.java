import java.util.Arrays;
import java.util.Scanner;

public class MedianFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Median Finder Program");
        System.out.println("-----------------------");

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        double[] numbers = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        Arrays.sort(numbers);
        double median = calculateMedian(numbers);
        System.out.println("Median: " + median);
    }
    public static double calculateMedian(double[] numbers) {
        int n = numbers.length;
        if (n % 2 == 0) {
            return (numbers[n / 2 - 1] + numbers[n / 2]) / 2;
        } else {
            return numbers[n / 2];
        }
    }
}