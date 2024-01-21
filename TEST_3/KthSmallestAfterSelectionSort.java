package TEST_3;

import java.util.Arrays;

public class KthSmallestAfterSelectionSort {

    public static void main(String[] args) {
        // Test cases for findKthSmallestAfterSelectionSort
        System.out.println(findKthSmallestAfterSelectionSort(new int[]{7, 10, 4, 3, 20, 15}, 3)); // Should return 7
        System.out.println(findKthSmallestAfterSelectionSort(new int[]{30, 20, 5, 10, 8}, 4)); // Should return 20
        System.out.println(findKthSmallestAfterSelectionSort(new int[]{100, 25, 12, 22, 64}, 2)); // Should return 22
    }

    // Method to implement
    public static int findKthSmallestAfterSelectionSort(int[] nums, int k) {
        // TODO: Implement the selection sort to sort the array
        selectioSort(nums,nums.length);
        System.out.println("\n Post selections ort sorting");
        System.out.println("New Sorted array"+ Arrays.toString(nums));
        // TODO: Return the k-th smallest element in the sorted array
        return nums[k-1]; // Placeholder return statement
    }

    private static void selectioSort(int[] nums, int length) {
        for(int i=0;i<length;i++){
            int minIndex =i;
            for(int j=i+1;j<length;j++){
                if(nums[minIndex]>nums[j]){
                    minIndex=j;
                }
            }
            swap(nums,minIndex,i);
        }
    }

    private static void swap(int[] nums, int minIndex, int i) {
        int temp = nums[minIndex];
        nums[minIndex]=nums[i];
        nums[i]=temp;
    }
}

