import java.util.Scanner;
public class TempConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to convert Celsius to Fahrenheit or 2 for Fahrenheit to Celsius:");
        int choice = sc.nextInt();
        System.out.println("Enter the temperature:");
        double temp = sc.nextDouble();

        if (choice == 1) {
            System.out.println("Fahrenheit: " + ((temp * 9 / 5) + 32));
        } else {
            System.out.println("Celsius: " + ((temp - 32) * 5 / 9));
        }
    }
}
