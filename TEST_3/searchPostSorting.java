package TEST_3;

public class searchPostSorting {
    public static void main(String[] args) {
        // Test cases for binarySearchAfterSelectionSort
        System.out.println(binarySearchAfterSelectionSort(new int[]{34, 21, 5, 22, 10}, 22)); // Should return 3
        System.out.println(binarySearchAfterSelectionSort(new int[]{10, 9, 8, 7, 6, 5}, 5)); // Should return 0
        System.out.println(binarySearchAfterSelectionSort(new int[]{1, 3, 5, 7, 9}, 4)); // Should return -1
    }

    // Method to implement
    public static int binarySearchAfterSelectionSort(int[] nums, int target) {
        // Sort the array using selection sort
        selectionSort(nums);

        // Perform binary search
        return binarySearch(nums, target);
    }

    private static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length ; j++) {
                if (nums[min] > nums[j]) {
                    min = j;
                }
            }
            swap(nums, min, i);
        }
    }

    private static void swap(int[] nums, int min, int i) {
        int temp = nums[min];
        nums[min] = nums[i];
        nums[i] = temp;
    }
}
