package TEST_3;

import java.util.Arrays;

public class SortAndRemoveDuplicates {
    public static void main(String[] args) {
        // Test cases for sortAndRemoveDuplicates
        System.out.println(sortAndRemoveDuplicates(new int[]{2, 1, 2})); // Should return 2
        System.out.println(sortAndRemoveDuplicates(new int[]{4, 2, 2, 3, 3, 4, 1})); // Should return 4
    }

    private static int sortAndRemoveDuplicates(int[] nums) {
        selSort(nums,nums.length);
        System.out.println("\n Sorted Array"+ Arrays.toString(nums));
        return removeDupes(nums,0);
    }

    private static int removeDupes(int[] nums, int i) {
        for(int j=1;j< nums.length-1;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }

        return i+1;
    }

    private static void selSort(int[] nums, int length) {
        for(int i =0;i<length;i++){
            int minIdx= i;
            for(int j=i+1;j<length;j++){
                if(nums[minIdx]>nums[j]){
                    minIdx=j;
                }
            }
            int temp = nums[minIdx];
            nums[minIdx]=nums[i];
            nums[i]=temp;
        }
    }
}
