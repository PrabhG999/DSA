package TEST_3;

import java.util.Arrays;

public class Rdupes {
    public static void main(String[] args) {
        int[] arrayWithDuplicates = {5, 2, 9, 1, 5, 6, 2, 9};

        System.out.println("Original Array: " + Arrays.toString(arrayWithDuplicates));

        int[] arrayWithoutDuplicates = removeDuplicates(arrayWithDuplicates);

        System.out.println("Array with Duplicates Removed: " + Arrays.toString(arrayWithoutDuplicates));
    }

    private static int[] removeDuplicates(int[] arrayWithDuplicates) {
        if (arrayWithDuplicates == null || arrayWithDuplicates.length <= 1) {
            System.out.println("It's null or already sorted ");
            return arrayWithDuplicates;
        }
        Arrays.sort(arrayWithDuplicates);     //always sort them before removing duplicates
        int i = 0;
        for (int j = 1; j < arrayWithDuplicates.length; j++) {
            if (arrayWithDuplicates[i] != arrayWithDuplicates[j]) {
                i++;
                arrayWithDuplicates[i] = arrayWithDuplicates[j];
            }
        }
        int result[] = Arrays.copyOf(arrayWithDuplicates, i + 1);
        return result;
    }
}
