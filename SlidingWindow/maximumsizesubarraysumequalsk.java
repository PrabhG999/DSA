package SlidingWindow;

public class maximumsizesubarraysumequalsk { //Leetcode 325
    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {2, 2, 2};
        int k1 = 4;
        int result1 = subarraySum(nums1, k1);
        System.out.println("Test case 1 result: " + result1); // Should output 2

        // Test case 2
        int[] nums2 = {3, 2, 1};
        int k2 = 3;
        int result2 = subarraySum(nums2, k2);
        System.out.println("Test case 2 result: " + result2); // Should output 2

        // Test case 3
        int[] nums3 = {2, 2, -4, 1, 1, 2};
        int k3 = -3;
        int result3 = subarraySum(nums3, k3);
        System.out.println("Test case 3 result: " + result3); // Should output 1

        System.out.println("Test cases passed!");
    }

    private static int subarraySum(int[] nums, int k) {
        int count =0;
        for(int i=0;i< nums.length;i++){
            int sum=0;
            for(int x= i;x<nums.length;x++){
                sum+= nums[x];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
}
