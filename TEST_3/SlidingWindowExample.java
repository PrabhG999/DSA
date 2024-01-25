package TEST_3;

public class SlidingWindowExample {

    public static void main(String[] args) {
        int[] nums1 = {2, 1, 5, 1, 3, 2};
        int k1 = 3;
        int maxSum1 = maxSumSubarray(nums1, k1);
        System.out.println("Test 1: Maximum Sum: " + maxSum1); // Expected output: Test 1: Maximum Sum: 9

        int[] nums2 = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k2 = 4;
        int maxSum2 = maxSumSubarray(nums2, k2);
        System.out.println("Test 2: Maximum Sum: " + maxSum2); // Expected output: Test 2: Maximum Sum: 24

        int[] nums3 = {3, 4, 5, 1, 6, 7};
        int k3 = 2;
        int maxSum3 = maxSumSubarray(nums3, k3);
        System.out.println("Test 3: Maximum Sum: " + maxSum3); // Expected output: Test 3: Maximum Sum: 13
    }

    private static int maxSumSubarray(int[] nums1, int k1) {
        int maxSum =0;
        int currSum =0;
        for(int i=0;i<k1;i++){
            maxSum+=nums1[i];    //adding the sum of subarray till k1
        }
        currSum=maxSum;
        for(int j =k1;j< nums1.length;j++){
            currSum = nums1[j]-nums1[j-k1];
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}
