package TEST_3;

public class MaxSumCircularSubarray {
    public static void main(String[] args) {
        int[] nums1 = {1, -2, 3, -2};
        int[] nums2 = {5, -3, 5};
        int[] nums3 = {-3, -2, -3};

        int maxSum1 = maxSubarraySumCircular(nums1);
        int maxSum2 = maxSubarraySumCircular(nums2);
        int maxSum3 = maxSubarraySumCircular(nums3);

        System.out.println("Output for nums1: " + maxSum1); // Output: 3
        System.out.println("Output for nums2: " + maxSum2); // Output: 10
        System.out.println("Output for nums3: " + maxSum3); // Output: -2
    }

    public static int maxSubarraySumCircular(int[] nums) {
        // Your implementation of finding maximum sum of a non-empty circular subarray goes here
        // Return the maximum possible sum of a non-empty subarray of nums
        int currMin =0,currMax =0,total =0;
        int gMax = nums[0], gMin = nums[0];

        for(int n:nums){
            currMin = Math.min(n,currMin+n);
            currMax = Math.max(n,currMax+n);
            total+=n;
            gMax = Math.max(gMax,currMax);
            gMin = Math.min(gMin,currMin);
        }
        return gMax>0 ? Math.max(gMax,total-gMin):gMax;
    }
}
