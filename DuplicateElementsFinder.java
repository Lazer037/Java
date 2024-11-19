import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateElementsFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Duplicate Elements Finder");
        System.out.println("---------------------------");

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Map<Integer, Integer> frequencyMap = findDuplicateElements(array);
        printFrequencyMap(frequencyMap);
    }
    public static Map<Integer, Integer> findDuplicateElements(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        return frequencyMap;
    }
    public static void printFrequencyMap(Map<Integer, Integer> frequencyMap) {
        System.out.println("Frequency Map:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}