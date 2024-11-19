import java.util.Scanner;

public class SumAndAverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sum and Average Calculator");
        System.out.println("-----------------------------");

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = calculateSum(array);
        double average = calculateAverage(sum, n);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
    public static double calculateAverage(int sum, int n) {
        return (double) sum / n;
    }
}