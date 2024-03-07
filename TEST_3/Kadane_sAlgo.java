package TEST_3;

public class Kadane_sAlgo {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = maxSubArray(nums);
        System.out.println("Maximum sum of a contiguous subarray: " + maxSum);
    }

    public static int maxSubArray(int[] nums) {
        // Your implementation of Kadane's Algorithm goes here
        // Return the maximum sum of a contiguous subarray
        int sum = 0, curSum = 0;
        for (int i = 0; i < nums.length; i++) {
            curSum = Math.max(nums[i], curSum + nums[i]);
            sum = Math.max(sum, curSum);

            if (sum < 0) {
                sum = 0;
            }
        }
        return sum;
    }
}
