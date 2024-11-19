import java.util.Scanner;
class Commission {
    private double sales;
    public Commission(double sales) {
        this.sales = sales;
    }
    public double commission() {
        if (sales < 0) {
            return 0; 
        } else if (sales <= 5000) {
            return sales * 0.05;
        } else if (sales <= 10000) {
            return sales * 0.10;
        } else {
            return sales * 0.15;
        }
    }
}
public class CommissionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Commission Calculator");
        System.out.println("------------------------");

        System.out.print("Enter sales: ");
        double sales = scanner.nextDouble();

        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission commission = new Commission(sales);
            double commissionAmount = commission.commission();
            System.out.println("Commission: " + commissionAmount);
        }
    }
}