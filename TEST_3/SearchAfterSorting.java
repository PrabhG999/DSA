package TEST_3;

import java.util.Arrays;

public class SearchAfterSorting {

    public static void main(String[] args) {
        // Test cases for binarySearchAfterSorting
        System.out.println(binarySearchAfterSorting(new int[]{34, 21, 5, 22, 10}, 22)); // Should return 3
        System.out.println(binarySearchAfterSorting(new int[]{10, 9, 8, 7, 6, 5}, 5)); // Should return 0
        System.out.println(binarySearchAfterSorting(new int[]{1, 3, 5, 7, 9}, 4)); // Should return -1
    }

    // Method to implement
    public static int binarySearchAfterSorting(int[] nums, int target) {
        // TODO: Implement the bubble sort to sort the array
        bubbleSort(nums, nums.length);
        System.out.println("\nThe arrays sorted via BUBBLE SORT");
        System.out.println(Arrays.toString(nums));
        // TODO: Implement the binary search algorithm to find the target
        System.out.println("Implementeing Binary Search ");
        return binSearch(nums, 0, nums.length - 1, target); // Placeholder return statement
    }

    private static int binSearch(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private static void bubbleSort(int[] nums, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] nums, int j, int i) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

