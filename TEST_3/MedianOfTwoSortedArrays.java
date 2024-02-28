package TEST_3;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Your solution goes here
        int len1 = nums1.length;
        int len2 = nums2.length;
        int merged[] = new int[len1 + len2];
        int i = 0, j = 0, k = 0;
        while (i < len1 && j < len2) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < len1) {
            merged[k++] = nums1[i++];
        }
        while (j < len2) {
            merged[k++] = nums2[j++];
        }
        if ((len1 + len2) % 2 == 0) {   //determine even or odd elements
            int mid = (len1 + len2) / 2;
            return (merged[mid - 1] + merged[mid]) / 2.0;
        } else {
            return merged[(len1 + len2) / 2];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Example 1:");
        System.out.println("Input: nums1 = [1,3], nums2 = [2]");
        System.out.println("Output: " + findMedianSortedArrays(nums1, nums2)); // You need to implement this method

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println("\nExample 2:");
        System.out.println("Input: nums1 = [1,2], nums2 = [3,4]");
        System.out.println("Output: " + findMedianSortedArrays(nums3, nums4)); // You need to implement this method
    }
}
