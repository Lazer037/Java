import java.util.Scanner;
public class MultiplesOfTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start and end of range:");
        int start = sc.nextInt(), end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 10 == 0) System.out.println(i);
        }
    }
}
