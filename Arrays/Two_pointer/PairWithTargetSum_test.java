package Arrays.Two_pointer;
import java.util.Arrays;

public class PairWithTargetSum_test {
    // Method to find two indices such that they add up to a specific target  (sort then search)
    private static void quick_sort(int[] nums,int low,int high) {
        if(low<high){
            int p = position(nums,low,high);
            quick_sort(nums,low,p-1);
            quick_sort(nums,p+1,high);
        }

    }

    private static int position(int[] nums, int low, int high) {
        int pivot =nums[high];
        int i = low-1;
        for(int j =low;j<high;j++){
            if(nums[j]<pivot){
                i++;
                swap(nums,j,i);
            }
        }
        swap(nums,i+1,high);
        return i+1;
    }

    private static void swap(int[] nums, int j, int i) {
        int temp = nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
    }

    private static int[] findPairWithTargetSum(int[] nums, int target) {  //two sum approach to find target k
        int first =0;
        int last = nums.length-1;
        while(first<last){
            int sum = nums[first]+nums[last];
                    if(sum == target){
                        return  new int[]{first,last};
                    } else if (sum<target) {
                        first++;
                    }else {
                        last--;
                    }
        }
        return new int[]{-1,-1};
    }

    // Main method with test cases
    public static void main(String[] args) {
        test(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}); // Test case 1
        test(new int[]{1, 2, 3, 4, 6}, 6, new int[]{1, 3}); // Test case 2
        test(new int[]{1, 3, 4, 5}, 8, new int[]{1, 3}); // Test case 3
        test(new int[]{1, 2, 3, 4}, 8, new int[]{-1, -1}); // Test case 4, no pair found
    }

    // Helper method for running test cases
    private static void test(int[] nums, int target, int[] expectedOutput) {
        quick_sort(nums,0,nums.length-1); // Ensure the array is sorted
        int[] result = findPairWithTargetSum(nums, target);
        if (Arrays.equals(result, expectedOutput)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed: expected " + Arrays.toString(expectedOutput) + ", but got " + Arrays.toString(result));
        }
    }
}
