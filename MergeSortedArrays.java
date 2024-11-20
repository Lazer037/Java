import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arrayA = {1, 3, 5, 7};
        int[] arrayB = {2, 4, 6, 8};
        int[] mergedArray = mergeSortedArrays(arrayA, arrayB);
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
    public static int[] mergeSortedArrays(int[] arrayA, int[] arrayB) {
        int[] mergedArray = new int[arrayA.length + arrayB.length];
        int i = 0, j = 0, k = 0;
        while (i < arrayA.length && j < arrayB.length) {
            if (arrayA[i] < arrayB[j]) {
                mergedArray[k++] = arrayA[i++];
            } else {
                mergedArray[k++] = arrayB[j++];
            }
        }
        while (i < arrayA.length) {
            mergedArray[k++] = arrayA[i++];
        }
        while (j < arrayB.length) {
            mergedArray[k++] = arrayB[j++];
        }

        return mergedArray;
    }
}