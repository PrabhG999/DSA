package TEST_3;
import java.util.Arrays;

public class InsertionSortTest {
    public static void main(String[] args) {
        // Test cases
        int[] test1 = {5, 2, 9, 1, 5, 6};
        System.out.println("Original Array 1: " + Arrays.toString(test1));
        insertionSort(test1);
        System.out.println("Sorted Array 1: " + Arrays.toString(test1));

        int[] test2 = {8, 4, 1, 7, 3, 9};
        System.out.println("\nOriginal Array 2: " + Arrays.toString(test2));
        insertionSort(test2);
        System.out.println("Sorted Array 2: " + Arrays.toString(test2));

        int[] test3 = {12, 11, 13, 5, 6};
        System.out.println("\nOriginal Array 3: " + Arrays.toString(test3));
        insertionSort(test3);
        System.out.println("Sorted Array 3: " + Arrays.toString(test3));
    }

    private static void insertionSort(int[] arr) {
        int size = arr.length;

        for(int i=0;i<size;i++){
            int key = arr[i];
            int j=i-1;

            while(j>=0 && j>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
