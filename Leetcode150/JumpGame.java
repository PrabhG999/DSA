package Leetcode150;

public class JumpGame {    //greedy
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println("Example 1 Output: " + canReachLastIndex(nums1)); // Output: true

        // Example 2
        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println("Example 2 Output: " + canReachLastIndex(nums2)); // Output: false
    }

    public static boolean canReachLastIndex(int[] nums) {
        // Your implementation here
        int length = nums.length, jump = 0;
        //edge cases
        if (nums == null || nums.length <= 0) {
            return false;
        }
        for (int i = 0; i <= jump; i++) {
            jump = Math.max(jump, i + nums[i]);
            if (jump >= length - 1) {
                return true;
            }
        }
        // Placeholder return value
        return false;
    }
}
