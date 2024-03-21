package Easy_Excel_Sheet;

import java.util.*;

public class MaxSubarray {
    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Example 1:");
        System.out.println("Input: nums = " + Arrays.toString(nums1));
        int maxSum1 = maxSubArray(nums1);
        System.out.println("Output: " + maxSum1);
        System.out.println();

        int[] nums2 = {1};
        System.out.println("Example 2:");
        System.out.println("Input: nums = " + Arrays.toString(nums2));
        int maxSum2 = maxSubArray(nums2);
        System.out.println("Output: " + maxSum2);
        System.out.println();

        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println("Example 3:");
        System.out.println("Input: nums = " + Arrays.toString(nums3));
        int maxSum3 = maxSubArray(nums3);
        System.out.println("Output: " + maxSum3);
    }

    public static int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = nums[0];
        for (int num : nums) {
            currSum += num;
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
