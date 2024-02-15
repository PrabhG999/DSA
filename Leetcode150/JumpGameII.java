package Leetcode150;

public class JumpGameII {
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println("Example 1 Output: " + jump(nums1)); // Output: 2

        // Example 2
        int[] nums2 = {2, 3, 0, 1, 4};
        System.out.println("Example 2 Output: " + jump(nums2)); // Output: 2
    }

    private static int jump(int[] nums) {
        int totalJumps =0, currPosition =0,jumps =0,start=0;
        int destination = nums.length-1;

        while(start<destination){
            jumps = Math.max(jumps,start+nums[start]);

            if(start==currPosition){
                currPosition=jumps;
                totalJumps++;
            }
            if(currPosition>=destination){
                return totalJumps;
            }
                start++;
        }
        return -1;
    }
}
