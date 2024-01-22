package TEST_3;

import java.util.Arrays;

public class TwoPointerSort {
    public static void twoPointerSort(int[] arr) {
        // Implement the insertion  sorting algorithm here
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

    }

    private static int removeDupes(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arrayToSort = {5, 2, 9, 1, 5, 6};

        System.out.println("Original Array: " + Arrays.toString(arrayToSort));

        // Remove duplicates and update the array length
        int newLength = removeDupes(arrayToSort);

        // Resize the array to remove extra duplicates
        int[] newArray = Arrays.copyOf(arrayToSort, newLength);

        // Sort the modified array
        twoPointerSort(newArray);

        System.out.println("Sorted Array: " + Arrays.toString(newArray));
    }
}
