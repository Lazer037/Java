public class Calculator {
    public int add(int num1, int num2) {
        System.out.println("Adding two integers");
        return num1 + num2;
    }
    public int add(int num1, int num2, int num3) {
        System.out.println("Adding three integers");
        return num1 + num2 + num3;
    }
    public double add(double num1, double num2) {
        System.out.println("Adding two floating-point numbers");
        return num1 + num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.add(10, 20);
        System.out.println("Result: " + result1);
        int result2 = calculator.add(10, 20, 30);
        System.out.println("Result: " + result2);
        double result3 = calculator.add(10.5, 20.7);
        System.out.println("Result: " + result3);
    }
}