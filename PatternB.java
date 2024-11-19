public class PatternB {
    public static void main(String[] args) {
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(Math.abs(i - k + 1) + " ");
            }
            System.out.println();
        }
    }
}