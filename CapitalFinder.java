import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}
public class CapitalFinder {
    private static final Map<String, String> countryToCapital = new HashMap<>();

    static {
        countryToCapital.put("india", "New Delhi");
        countryToCapital.put("united states", "Washington, D.C.");
        countryToCapital.put("china", "Beijing");
        countryToCapital.put("japan", "Tokyo");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a country: ");
        String country = scanner.nextLine().toLowerCase();

        try {
            String capital = findCapital(country);
            System.out.println("Capital of " + country + ": " + capital);
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    public static String findCapital(String country) throws NoMatchFoundException {
        String capital = countryToCapital.get(country);
        if (capital == null) {
            throw new NoMatchFoundException("No match found for country: " + country);
        }
        return capital;
    }
}