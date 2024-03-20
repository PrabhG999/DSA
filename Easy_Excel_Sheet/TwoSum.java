package Easy_Excel_Sheet;

import java.util.*;

public class TwoSum {
    public static class Main {
        public static void main(String[] args) {
            // Test cases
            int[] nums1 = {2, 7, 11, 15};
            int target1 = 9;
            System.out.println("Example 1:");
            System.out.println("Input: nums = " + Arrays.toString(nums1) + ", target = " + target1);
            int[] result1 = twoSum(nums1, target1);
            System.out.println("Output: " + Arrays.toString(result1));
            System.out.println();

            int[] nums2 = {3, 2, 4};
            int target2 = 6;
            System.out.println("Example 2:");
            System.out.println("Input: nums = " + Arrays.toString(nums2) + ", target = " + target2);
            int[] result2 = twoSum(nums2, target2);
            System.out.println("Output: " + Arrays.toString(result2));
            System.out.println();

            int[] nums3 = {3, 3};
            int target3 = 6;
            System.out.println("Example 3:");
            System.out.println("Input: nums = " + Arrays.toString(nums3) + ", target = " + target3);
            int[] result3 = twoSum(nums3, target3);
            System.out.println("Output: " + Arrays.toString(result3));
        }
    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null) {
                return new int[]{i, map.get(target - nums[i])};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
