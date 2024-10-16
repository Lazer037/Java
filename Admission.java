import java.util.Scanner;
public class Admission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in Math, Physics, and Chemistry:");
        int math = sc.nextInt(), physics = sc.nextInt(), chemistry = sc.nextInt();
        
        boolean eligible = (math >= 60 && physics >= 50 && chemistry >= 40 &&
                            (math + physics + chemistry >= 200 || math + physics >= 150));
        
        System.out.println(eligible ? "Eligible" : "Not Eligible");
    }
}
