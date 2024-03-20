package TEST_3;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1};
        int[] nums3 = {5, 4, -1, 7, 8};

        System.out.println(maxSubArray(nums1)); // Output: 6
        System.out.println(maxSubArray(nums2)); // Output: 1
        System.out.println(maxSubArray(nums3)); // Output: 23
    }

    public static int maxSubArray(int[] nums) {
        //Kadane's Algorithm
        // Your implementation goes here
        // Find and return the sum of the subarray with the largest sum
        int currSum = nums[0];
        int maxSum = nums[0];
        for(int i =1;i< nums.length;i++){
            currSum = Math.max(nums[i],currSum+nums[i]);
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }

}
