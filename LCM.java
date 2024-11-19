import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("LCM of Two Numbers Program");
        System.out.println("--------------------------------");

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int lcm = calculateLCM(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
    }
    public static int calculateLCM(int num1, int num2) {
        int hcf = calculateHCF(num1, num2);
        return (num1 * num2) / hcf;
    }
    public static int calculateHCF(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return calculateHCF(num2, num1 % num2);
    }
}