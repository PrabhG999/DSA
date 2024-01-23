package TEST_3;
import java.util.Arrays;

public class RemoveDupesandSort {
    public static int[] removeDuplicatesAndSort(int[] arr) {
        // Your code to remove duplicates and sort the array goes here
        insertionSort(arr);
        int newLength = removeDupes(arr);

        // Resize the array to remove extra duplicates
        int[] newArray = Arrays.copyOf(arr, newLength);

        return newArray;
    }

    private static void insertionSort(int[] arr) {
        for(int i= 1;i< arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                    arr[j+1]=arr[j];
                    j--;
            }
            arr[j+1]=key;
        }
    }

    private static int removeDupes(int[] arr) {
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        // Test cases
        int[] test1 = {5, 2, 9, 1, 5, 6};
        int[] result1 = removeDuplicatesAndSort(test1);
        System.out.println("Test 1: " + Arrays.toString(result1)); // Expected output: [1, 2, 5, 6, 9]

        int[] test2 = {8, 4, 1, 7, 3, 9, 4};
        int[] result2 = removeDuplicatesAndSort(test2);
        System.out.println("Test 2: " + Arrays.toString(result2)); // Expected output: [1, 3, 4, 7, 8, 9]

        int[] test3 = {12, 11, 13, 5, 6, 12, 6};
        int[] result3 = removeDuplicatesAndSort(test3);
        System.out.println("Test 3: " + Arrays.toString(result3)); // Expected output: [5, 6, 11, 12, 13]
    }
}
