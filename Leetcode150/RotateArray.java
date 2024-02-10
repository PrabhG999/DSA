package Leetcode150;
import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        int[] expectedNums1 = {5, 6, 7, 1, 2, 3, 4};
        testRotateArray(nums1, k1, expectedNums1);

        // Example 2
        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        int[] expectedNums2 = {3, 99, -1, -100};
        testRotateArray(nums2, k2, expectedNums2);
    }

    private static void testRotateArray(int[] nums, int k, int[] expectedNums) {
        rotate(nums, k);
        System.out.println("Output: " + Arrays.toString(nums));
        System.out.println("Expected: " + Arrays.toString(expectedNums));
        assert Arrays.equals(nums, expectedNums);
    }

    public static void rotate(int[] nums, int k) {
        // Your implementation here
        int flipped[]= new int[nums.length];
        k= k% nums.length;
        for(int i =0;i< nums.length;i++){
            flipped[(i+k)% nums.length]=nums[i];
        }
        for(int i=0;i< flipped.length;i++){
            nums[i]=flipped[i];
        }
    }

}
