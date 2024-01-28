package Arrays.Merge_Sort;

public class IDArrayMergeSort {

    public static void main(String[] args) {
        // Test 1: Regular case
        int[] ids1 = {1023, 1540, 763, 986, 430, 1245};
        testMergeSort(ids1, "Test 1");

        // Test 2: Already sorted
        int[] ids2 = {123, 456, 789, 1011, 1213, 1415};
        testMergeSort(ids2, "Test 2");

        // Test 3: Reverse order
        int[] ids3 = {1415, 1213, 1011, 789, 456, 123};
        testMergeSort(ids3, "Test 3");

        // Test 4: All elements are same
        int[] ids4 = {999, 999, 999, 999, 999};
        testMergeSort(ids4, "Test 4");
    }

    private static void testMergeSort(int[] ids, String testName) {
        System.out.println(testName + " - Original: ");
        printArray(ids);

        mergeSort(ids, 0, ids.length - 1);

        System.out.println(testName + " - Sorted: ");
        printArray(ids);
    }

    private static void mergeSort(int[] array, int left, int right) {
        // TODO: Implement the merge sort algorithm
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int middle, int right) {
        // TODO: Implement the merging of two sorted halves
        int merged[] = new int[right - left + 1];
        int x = 0;
        int indx1 = left;
        int indx2 = middle + 1;

        while (indx1 <= middle && indx2 <= right) {
            if (array[indx1] <= array[indx2]) {
                merged[x++] = array[indx1++];
            } else {
                merged[x++] = array[indx2++];
            }
        }
        while (indx1 <= middle) {
            merged[x++] = array[indx1++];
        }
        while (indx2 <= right) {
            merged[x++] = array[indx2++];
        }
        for (int i = 0, j = left; i < merged.length; i++, j++) {
            array[j] = merged[i];

        }
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
