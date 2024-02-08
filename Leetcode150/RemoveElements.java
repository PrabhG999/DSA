package Leetcode150;
import java.util.*;

public class RemoveElements {
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int expectedLength1 = 2;
        int[] expectedNums1 = {2, 2};
        testRemoveElement(nums1, val1, expectedLength1, expectedNums1);

        // Example 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int expectedLength2 = 5;
        int[] expectedNums2 = {0, 1, 4, 0, 3};
        testRemoveElement(nums2, val2, expectedLength2, expectedNums2);
    }

    private static void testRemoveElement(int[] nums, int val, int expectedLength, int[] expectedNums) {
        int k = removeElement(nums, val);
        System.out.println("Output: " + k + ", nums = " + Arrays.toString(Arrays.copyOf(nums, k)));
        System.out.println("Expected length: " + expectedLength + ", Expected nums: " + Arrays.toString(expectedNums));
        assert k == expectedLength;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    private static int removeElement(int[] nums, int val) {     //remove element of VAL from array
        int size = nums.length;
        int j =0;
        for(int i=0;i<size;i++){
            if(val!= nums[i]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
