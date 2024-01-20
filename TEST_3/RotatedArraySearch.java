package TEST_3;

import java.util.Arrays;

public class RotatedArraySearch {

    public static void main(String[] args) {
        // Test cases for searchInRotatedSortedArray
        System.out.println(searchInRotatedSortedArray(new int[]{4, 5, 6, 7, 0, 1, 2}, 0)); // Should return 4
        System.out.println(searchInRotatedSortedArray(new int[]{6, 7, 0, 1, 2, 4, 5}, 3)); // Should return -1
        System.out.println(searchInRotatedSortedArray(new int[]{50, 60, 70, 80, 90, 10, 20, 30, 40}, 60)); // Should return 1
        System.out.println(searchInRotatedSortedArray(new int[]{5, 1, 2, 3, 4}, 1)); // Should return 1
    }

    // Method to implement
    public static int searchInRotatedSortedArray(int[] nums, int target) {
        // TODO: Implement the binary search algorithm adapted for rotated sorted array
        int left = 0;
        int right = nums.length - 1;

       while(left <= right){
           int mid = (left+right)/2;

           if(nums[mid]==target){
               return mid;
           }

           else if(nums[left]<nums[mid]){

               if (target>=nums[left] && target<=nums[mid]){
                   right = mid-1;
               }else {
                   left = mid+1;
               }
           }else{
               if (target>=nums[mid] && target<=nums[right]){
                   right = mid-1;
               }else {
                   left = mid+1;
               }
           }
       }
        return -1; // Placeholder return statement
    }
}

