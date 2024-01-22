package TEST_3;

import java.util.Arrays;

public class SquaresOfSortedArray {


    public static void main(String[] args) {
        // Test cases for sortedSquares
        int[] nums1 = {-4, -1, 0, 3, 10};
        System.out.println("Squares sorted: " + Arrays.toString(sortedSquares(nums1))); // Should print: Squares sorted: [0, 1, 9, 16, 100]

        int[] nums2 = {-7, -3, 2, 3, 11};
        System.out.println("Squares sorted: " + Arrays.toString(sortedSquares(nums2))); // Should print: Squares sorted: [4, 9, 9, 49, 121]
    }

    // Method to implement (you need to implement this method)
    public static int[] sortedSquares(int[] nums) {
        // Square each element
        int[] squaredNums = squaring(nums);

        // Sort the squared numbers
        selectionSort(squaredNums);

        return squaredNums;
    }

    private static int[] squaring(int[] nums) {
        int[] squaredNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            squaredNums[i] = nums[i] * nums[i];
        }
        return squaredNums;
    }

    private static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIdx] > nums[j]) {
                    minIdx = j;
                }
            }
            swap(nums, minIdx, i);
        }
    }

    private static void swap(int[] nums, int minIdx, int i) {
        int temp = nums[minIdx];
        nums[minIdx] = nums[i];
        nums[i] = temp;
    }
}


