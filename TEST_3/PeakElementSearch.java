package TEST_3;

import java.util.Arrays;

public class PeakElementSearch {

    public static void main(String[] args) {
        // Test cases for findPeakElement
        System.out.println(findPeakElement(new int[]{1, 2, 3, 1})); // Should return 2
        System.out.println(findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4})); // Should return 1 or 5
    }

    // Method to implement
    public static int findPeakElement(int[] nums) {
        // TODO: Implement the modified binary search algorithm to find a peak element
       // bubbleSort(nums,nums.length);
       // System.out.println(Arrays.toString(nums));

        return binarySearch(nums,0,nums.length-1); // Placeholder return statement
    }


   /* private static void bubbleSort(int[] nums, int length) {
        for(int i =0;i<length;i++){
            for(int j =0;j<length-1;j++){
                if(nums[j]>nums[j+1]){    //the answer changes if you sort the array
                    swap(nums,j,j+1);
                }
            }
        }
    }*/

   /* private static void swap(int[] nums, int j, int i) {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }*/

    private static int binarySearch(int[] nums, int left, int right) {
        while(left<right){
            int mid = (left +right)/2;
            if(nums[mid]<nums[mid+1]){
                left = mid+1;
            }else {
                right = mid;
            }
        }
        return left;
    }
}

