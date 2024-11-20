class Num {
    protected int number;

    public Num(int number) {
        this.number = number;
    }

    public void showNum() {
        System.out.println("Decimal Number: " + number);
    }
}
class HexNum extends Num {
    public HexNum(int number) {
        super(number);
    }

    @Override
    public void showNum() {
        super.showNum();
        System.out.println("Hexadecimal Number: " + Integer.toHexString(number));
        System.out.println("Octal Number: " + Integer.toOctalString(number));
    }
}

public class Main {
    public static void main(String[] args) {
        Num num = new Num(10);
        num.showNum();
        System.out.println();
        HexNum hexNum = new HexNum(10);
        hexNum.showNum();
    }
}