public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        for (int i = 1; i <= 12; i++) {
            fact *= i;
        }
        System.out.println("Factorial of 12: " + fact);
    }
}
