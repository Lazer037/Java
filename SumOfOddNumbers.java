import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sum of Odd Numbers in Array");
        System.out.println("--------------------------------");

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = sumOfOddNumbers(array);
        System.out.println("Sum of odd numbers: " + sum);
    }
    public static int sumOfOddNumbers(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }
}