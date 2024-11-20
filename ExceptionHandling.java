public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int divideByZero = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Inside finally block");
        }
        try {
            throw new RuntimeException("Explicitly thrown exception");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
        try {
            throwException();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
    public static void throwException() throws Exception {
        throw new Exception("Thrown exception");
    }
}