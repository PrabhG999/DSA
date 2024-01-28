package Arrays.Merge_Sort;

public class EmployeeIDMergeSort {

    public static void main(String[] args) {
        int[] employeeIDs = {1023, 1540, 763, 986, 430, 1245};

        System.out.println("Original Employee IDs: ");
        printArray(employeeIDs);

        mergeSort(employeeIDs, 0, employeeIDs.length - 1);

        System.out.println("Sorted Employee IDs: ");
        printArray(employeeIDs);
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
        int indx2 = middle+1;
        while (indx1 <= middle && indx2 <= right) {
            if (array[indx1] < array[indx2]) {
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
