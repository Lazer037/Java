import java.util.Scanner;
public class MilesToKm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in miles:");
        double miles = sc.nextDouble();

        System.out.println("Kilometers: " + (miles * 1.60934));
    }
}
