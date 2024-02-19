package Recursion;

public class ArraySortCheck {
    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Array 1 is sorted: " + isSorted(arr1, 0));

        int[] arr2 = {5, 4, 3, 2, 1};
        System.out.println("Array 2 is sorted: " + isSorted(arr2, 0));

        int[] arr3 = {1, 3, 2, 4, 5};
        System.out.println("Array 3 is sorted: " + isSorted(arr3, 0));
    }

    private static Boolean isSorted(int[] arr, int index) {
        if (index == arr.length-1) {
            return true;
        }
        if (arr[index] < arr[index + 1]) {
            return isSorted(arr, index + 1);
        }
        return false;
    }
}
