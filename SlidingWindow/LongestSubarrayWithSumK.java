package SlidingWindow;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr1 = { 10, 5, 2, 7, 1, 9 };
        int k1 = 15;
        System.out.println("Test case 1 Output: " + longestSubarrayWithSumK(arr1, k1)); // Output: 4

        int[] arr2 = { -5, 8, -14, 2, 4, 12 };
        int k2 = -5;
        System.out.println("Test case 2 Output: " + longestSubarrayWithSumK(arr2, k2)); // Output: 5
    }

    private static int longestSubarrayWithSumK(int[] arr, int k) {
        int maxLen =0;
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j =i;j<arr.length;j++){
                sum+=arr[j];

                if(sum==k){
                    maxLen=Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }
}
