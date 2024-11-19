import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("HCF of Two Numbers Program");
        System.out.println("--------------------------------");

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int hcf = calculateHCF(num1, num2);
        System.out.println("HCF of " + num1 + " and " + num2 + " is " + hcf);
    }
    public static int calculateHCF(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return calculateHCF(num2, num1 % num2);
    }
}