package TEST_3;

public class SearchWithBubbleSort {

    public static void main(String[] args) {
        // Test cases for binarySearchWithBubbleSort
        System.out.println(binarySearchWithBubbleSort(new int[]{5, 3, 6, 2, 10}, 6)); // Should return 3
        System.out.println(binarySearchWithBubbleSort(new int[]{12, 4, 7, 9, 2}, 3)); // Should return -1
        System.out.println(binarySearchWithBubbleSort(new int[]{15, 20, 5, 30, 10}, 15)); // Should return 2
        System.out.println(binarySearchWithBubbleSort(new int[]{1, 1, 2, 2, 3}, 2)); // Should return 2 or 3
    }

    // Method to implement
    public static int binarySearchWithBubbleSort(int[] nums, int target) {
        // TODO: Implement the bubble sort to sort the array
        bubbleSort(nums, nums.length);
        // TODO: Implement the binary search algorithm to find the target

        return binSearch(nums,0,nums.length-1,target); // Placeholder return statement
    }

    private static void bubbleSort(int[] nums, int length) {
        //implementing bubble sort
        //first for loop to go over the whole nums
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }
    }
    private static void swap(int[] nums, int j, int i) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private static int binSearch(int[] nums, int l, int r, int target) {
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]<=target) {
                l = mid+1;
            }else {
                r = mid-1;
            }
        }
        return -1;
    }
}
