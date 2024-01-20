package TEST_3;

import java.util.Arrays;

import static java.lang.Math.*;

public class ClosestPairSearch {

    public static void main(String[] args) {
        // Test cases for findClosestPair
        System.out.println(Arrays.toString(findClosestPair(new int[]{10, 30, 28, 29, 22, 40}, 54))); // Should return [22, 30]
        System.out.println(Arrays.toString(findClosestPair(new int[]{1, 10, 4, 7, 3}, 15))); // Should return [4, 10]
        System.out.println(Arrays.toString(findClosestPair(new int[]{0, 85, 59, 101, 145}, 87))); // Should return [59, 85]
        System.out.println(Arrays.toString(findClosestPair(new int[]{-1, 2, 1, -4}, 1))); // Should return [-1, 2]
    }

    // Method to implement
    public static int[] findClosestPair(int[] nums, int targetSum) {
        // TODO: Implement the bubble sort to sort the array
        bubbleSort(nums, nums.length);
        // TODO: Implement the algorithm to find the pair of elements whose sum is closest to the targetSum
        return binSearch(nums, 0, nums.length - 1, targetSum); // Placeholder return statement
    }

    private static void bubbleSort(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
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

    private static int[] binSearch(int[] nums, int left, int right, int targetSum) {
        // need to track closest sum
        int closestSum = Integer.MAX_VALUE;
        int closestPair[] = {-1, -1};
        while (left < right) {
            int currSum = nums[left] + nums[right];

            if (Math.abs(targetSum - currSum) < Math.abs(targetSum - closestSum)) {
                closestSum = currSum;
                closestPair[0] = nums[left];
                closestPair[1] = nums[right];
            }
                if (currSum == targetSum) {
                    return new int[] {nums[left],nums[right]};
                } else if (currSum < targetSum) {
                    left += 1;
                } else {
                    right -= 1;
                }


        }

        return closestPair;
    }

}
