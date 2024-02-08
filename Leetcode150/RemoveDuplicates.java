package Leetcode150;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 1, 2};
        int expectedLength1 = 2;
        int[] expectedNums1 = {1, 2};
        testRemoveDuplicates(nums1, expectedLength1, expectedNums1);

        // Example 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expectedLength2 = 5;
        int[] expectedNums2 = {0, 1, 2, 3, 4};
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
        int m = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[m]!= nums[i]){
                m++;
                nums[m]= nums[i];
            }
        }
        return m+1;
        /*int m = 0; Alternate Approach (Faster)
        for(int i=1;i<nums.length;i++){
            if(nums[m]!= nums[i]){
                m++;
                nums[m]= nums[i];
            }
        }
        return m+1;*/
    }
}

