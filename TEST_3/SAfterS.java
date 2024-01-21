package TEST_3;
import java.util.Arrays;

public class SAfterS {
    public static void main(String[] args) {
        // Test cases for binarySearchAfterSelectionSort
        System.out.println(Arrays.toString(binarySearchAfterSelectionSort(new int[]{34, 21, 5, 22, 10}, new int[]{22, 7}))); // Should return [true, false]
        System.out.println(Arrays.toString(binarySearchAfterSelectionSort(new int[]{10, 9, 8, 7, 6, 5}, new int[]{5, 11}))); // Should return [flase,false]
        System.out.println(Arrays.toString(binarySearchAfterSelectionSort(new int[]{1, 3, 5, 7, 9}, new int[]{4, 7}))); // Should return [false, true]
    }

    // Method to implement
    public static boolean[] binarySearchAfterSelectionSort(int[] nums, int[] targets) {
        // TODO: Implement the selection sort to sort the array
        selectionSort(nums,nums.length);
        System.out.println("\n Sorted Arrays "+ Arrays.toString(nums));
        // TODO: Implement the binary search for each target and store the result in the result array
        boolean[] results = new boolean[targets.length];

        // Perform binary search for each target
        for (int i = 0; i < targets.length; i++) {
            results[i] = binarySearch(nums, targets[i]) != -1;
        }

        return results; // Placeholder return statement
    }

    private static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right  = nums.length-1;
        while(left<right){
            int mid= (left +right)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }

    private static void selectionSort(int[] nums, int length) {
        for(int i =0;i<length;i++){
            int minIdx = i;
            for(int j =i+1;j<length-1;j++){
                if(nums[minIdx]>nums[j]){
                    minIdx=j;
                }
            }
            swap(nums,minIdx,i);
        }
    }

    private static void swap(int[] nums, int minIdx, int i) {
        int temp = nums[minIdx];
        nums[minIdx]=nums[i];
        nums[i]=temp;
    }
}
