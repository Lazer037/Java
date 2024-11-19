import java.util.Scanner;
public class Divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num = sc.nextInt();
        int divisor = sc.nextInt();

        if (num % divisor == 0)
            System.out.println(num + " is divisible by " + divisor);
        else
            System.out.println(num + " is not divisible by " + divisor);
    }
}
