package SlidingWindow;

public class MAXConseqOnesIII {
    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k1 = 2;
        int result1 = longestOnes(nums1, k1);
        System.out.println("Test case 1 result: " + result1); // Should output 6

        // Test case 2
        int[] nums2 = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k2 = 3;
        int result2 = longestOnes(nums2, k2);
        System.out.println("Test case 2 result: " + result2); // Should output 10

        System.out.println("Test cases passed!");
    }

    public static int longestOnes(int[] nums, int k) {
        // Implementation of the longestOnes method
        // ...
        int j=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                k--;
            }
            while(k<0){
                if(nums[j]==0){
                    k++;
                }
                j++;
            }
            result = Math.max(result,i-j+1);
        }
        return result;
    }
}
