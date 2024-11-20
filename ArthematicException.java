class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}

public class Calculator {
    public static void main(String[] args) {
        try {
            calculateEquation(10, 0, 5); 
        } catch (CustomArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            calculateEquation(10, 5, -5); 
        } catch (CustomArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void calculateEquation(double num1, double num2, double num3) throws CustomArithmeticException {
        if (num2 == 0) {
            throw new CustomArithmeticException("Cannot divide by zero!");
        }

        if (num3 < 0) {
            throw new CustomArithmeticException("Cannot calculate square root of a negative number!");
        }

        double result = (num1 + num2) / num2 + Math.sqrt(num3);
        System.out.println("Result: " + result);
    }
}