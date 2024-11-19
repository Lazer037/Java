import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrome Number Checker");
        System.out.println("---------------------------");

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPalindrome = isPalindrome(number);
        if (isPalindrome) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }
    public static boolean isPalindrome(int number) {
        int reversedNumber = reverseNumber(number);
        return number == reversedNumber;
    }
    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
}