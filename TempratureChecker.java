class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}
class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class TemperatureChecker {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java TemperatureChecker <temperature>");
            return;
        }

        try {
            double temperature = Double.parseDouble(args[0]);
            checkTemperature(temperature);
        } catch (NumberFormatException e) {
            System.out.println("Invalid temperature value. Please enter a number.");
        } catch (TooHot | TooCold e) {
            System.out.println(e.getMessage());
        }
    }
    public static void checkTemperature(double temperature) throws TooHot, TooCold {
        if (temperature > 40) {
            throw new TooHot("Temperature is too hot! (>" + 40 + "°C)");
        } else if (temperature < 10) {
            throw new TooCold("Temperature is too cold! (<" + 10 + "°C)");
        } else {
            System.out.println("Temperature is normal. (" + temperature + "°C)");
        }
    }
}