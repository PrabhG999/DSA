package Hashing;
import java.util.*;
public class longestConsecutive {
    public static void main(String[] args) {
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Example 1: ");
        System.out.println("Input: nums = [100,4,200,1,3,2]");
        System.out.println("Output: " + longestConsecutive(nums1));

        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println("Example 2: ");
        System.out.println("Input: nums = [0,3,7,2,5,8,4,6,0,1]");
        System.out.println("Output: " + longestConsecutive(nums2));
    }
    public static int longestConsecutive(int[] nums) {
        // Check if the array is null or empty, return 0 for these cases
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Initialize a HashSet to store unique elements
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        // Initialize maxLength to keep track of the longest consecutive sequence
        int maxLength = 0;

        // Iterate through each number in the unique set
        for (int num : numSet) {
            // Check if the current number is the start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                // Continue the sequence
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentLength += 1;
                }

                // Update maxLength if the current sequence is longer
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        // Return the length of the longest consecutive sequence
        return maxLength;
    }
}
