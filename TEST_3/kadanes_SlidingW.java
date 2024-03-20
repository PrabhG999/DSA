package TEST_3;

import java.util.*;

public class kadanes_SlidingW {
    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Test Case 1:");
        System.out.println("Input: " + arrayToString(nums1));
        int[] indices1 = maxSubArrayIndices(nums1); // Expected: [3, 6]
        System.out.println("Indices: " + Arrays.toString(indices1));
        System.out.println();

        // Test case 2
        int[] nums2 = {1};
        System.out.println("Test Case 2:");
        System.out.println("Input: " + arrayToString(nums2));
        int[] indices2 = maxSubArrayIndices(nums2); // Expected: [0, 0]
        System.out.println("Indices: " + Arrays.toString(indices2));
        System.out.println();

        // Test case 3
        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println("Test Case 3:");
        System.out.println("Input: " + arrayToString(nums3));
        int[] indices3 = maxSubArrayIndices(nums3); // Expected: [0, 4]
        System.out.println("Indices: " + Arrays.toString(indices3));
    }

    public static int[] maxSubArrayIndices(int[] nums) {
        int maxSum = nums[0];
        int currSum = 0;
        int L = 0, start = 0, end = 0;
        for (int R = 0; R < nums.length; R++) {
            if (currSum < 0) {
                currSum = 0;
                L = R;
            }
            currSum += nums[R];
            if (currSum > maxSum) {
                maxSum = currSum;
                start = L;
                end = R;
            }
        }
        return new int[]{start, end};
    }

    public static String arrayToString(int[] nums) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
            if (i < nums.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
