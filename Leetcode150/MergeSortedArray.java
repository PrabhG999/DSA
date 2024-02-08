package Leetcode150;

import java.util.*;

public class MergeSortedArray {
    public static void main(String[] args) {
        // Example 1
        int[] nums1_1 = {1, 2, 3, 0, 0, 0};
        int m1 = 3;
        int[] nums2_1 = {2, 5, 6};
        int n1 = 3;
        merge(nums1_1, m1, nums2_1, n1);
        System.out.println("Example 1 Output: " + Arrays.toString(nums1_1)); // Output: [1, 2, 2, 3, 5, 6]

        // Example 2
        int[] nums1_2 = {1};
        int m2 = 1;
        int[] nums2_2 = {};
        int n2 = 0;
        merge(nums1_2, m2, nums2_2, n2);
        System.out.println("Example 2 Output: " + Arrays.toString(nums1_2)); // Output: [1]

        // Example 3
        int[] nums1_3 = {0};
        int m3 = 0;
        int[] nums2_3 = {1};
        int n3 = 1;
        merge(nums1_3, m3, nums2_3, n3);
        System.out.println("Example 3 Output: " + Arrays.toString(nums1_3)); // Output: [1]
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int merged[] = new int[m + n];
        int x = 0;

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[x++] = nums1[i++];
            } else {
                merged[x++] = nums2[j++];
            }
        }
        while (i < m) {
            merged[x++] = nums1[i++];
        }
        while (j < n) {
            merged[x++] = nums2[j++];
        }
        sorting(merged);
        for(int y =0;y< merged.length;y++){
            nums1[y]= merged[y];
        }
    }

    private static void sorting(int[] merged) {
        int size = merged.length;
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(merged[j]>merged[j+1]) {
                    swap(merged, j+1, j);
                }
            }
        }
    }

    private static void swap(int[] merged, int i, int j) {
        int temp = merged[j];
        merged[j]=merged[j+1];
        merged[j+1]= temp;

    }
}
