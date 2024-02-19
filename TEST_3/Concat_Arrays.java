package TEST_3;

import java.util.*;

public class Concat_Arrays {
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 2, 1};
        int[] ans1 = getConcatenation(nums1);
        System.out.println("Example 1 Output: " + Arrays.toString(ans1));
        // Expected Output: [1, 2, 1, 1, 2, 1]

        // Example 2
        int[] nums2 = {1, 3, 2, 1};
        int[] ans2 = getConcatenation(nums2);
        System.out.println("Example 2 Output: " + Arrays.toString(ans2));
        // Expected Output: [1, 3, 2, 1, 1, 3, 2, 1]
    }

    private static int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int result[] = new int[length * 2];
        for (int i = 0; i < length; i++) {
            result[i] = nums[i];
            result[length + i] = nums[i];
        }
        return result;
    }

}
