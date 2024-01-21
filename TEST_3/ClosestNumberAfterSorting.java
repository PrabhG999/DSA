package TEST_3;

public class ClosestNumberAfterSorting {
    public static void main(String[] args) {
        // Test cases for findClosestNumberAfterSelectionSort
        System.out.println(findClosestNumberAfterSelectionSort(new int[]{4, 1, 7, 10, 13}, 8)); // Should return 7
        System.out.println(findClosestNumberAfterSelectionSort(new int[]{15, 12, 9, 3, 6}, 10)); // Should return 9
        System.out.println(findClosestNumberAfterSelectionSort(new int[]{2, 5, 8, 12, 16}, 11)); // Should return 12
    }

    // Method to implement
    public static int findClosestNumberAfterSelectionSort(int[] nums, int target) {
        // Sort the array using selection sort
        selectionSort(nums);

        // Perform binary search or modified binary search to find the closest number
        return binarySearchForClosest(nums, target);
    }

    private static int binarySearchForClosest(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int closest= nums[0];
        while(l<r){
            int mid = (l+r)/2;
            if(Math.abs(target-nums[mid])<Math.abs(target-closest)){
                closest=nums[mid];
            }
            if(nums[mid]==target){
                return nums[mid];
            } else if (nums[mid]<target) {
                l= mid+1;
            }else {
                r = mid-1;
            }
        }
        return closest;
    }

    private static void selectionSort(int[] nums) {
        for(int i =0;i<nums.length;i++){
            int min = i;
            for(int j=i+1;j< nums.length;j++){
                if(nums[min]>nums[j]){
                    min=j;
                }
            }
            swap(nums,min,i);
        }
    }

    private static void swap(int[] nums, int min, int i) {
        int temp = nums[min];
        nums[min]=nums[i];
        nums[i]=temp;
    }
}
