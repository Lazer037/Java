public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int[] array = new int[-5];
            System.out.println("Array size: " + array.length);
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        }
        try {
            int divideByZero = 10 / 0;
            System.out.println("Result: " + divideByZero);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}