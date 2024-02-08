package Leetcode150;
import java.util.*;

public class RemoveDuplicatesII {
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int expectedLength1 = 5;
        int[] expectedNums1 = {1, 1, 2, 2, 3};
        testRemoveDuplicates(nums1, expectedLength1, expectedNums1);

        // Example 2
        int[] nums2 = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int expectedLength2 = 7;
        int[] expectedNums2 = {0, 0, 1, 1, 2, 3, 3};
        testRemoveDuplicates(nums2, expectedLength2, expectedNums2);
    }

    private static void testRemoveDuplicates(int[] nums, int expectedLength, int[] expectedNums) {
        int k = removeDuplicates(nums);
        System.out.println("Output: " + k + ", nums = " + Arrays.toString(Arrays.copyOf(nums, k)));
        System.out.println("Expected length: " + expectedLength + ", Expected nums: " + Arrays.toString(expectedNums));
        assert k == expectedLength;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    private static int removeDuplicates(int[] nums) {
        int size = nums.length;
        int i=2;
        for(int j =2;j<size;j++){
            if(nums[j]!=nums[i-2]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}
