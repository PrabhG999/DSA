package TEST_3;

import java.util.HashSet;

public class LongestConsequitiveSequence {
    public static void main(String[] args) {
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

        System.out.println("Longest consecutive sequence length for nums1: " + longestConsecutive(nums1));
        System.out.println("Longest consecutive sequence length for nums2: " + longestConsecutive(nums2));
    }

    private static int longestConsecutive(int[] nums) {
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        //first will add all the elements
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if (!set.contains(num - 1)) {   //checking if set does not contain something small than num make current
                int current = num + 1;
                while (set.contains(current)) {
                    current += 1;
                }
                int lastElement = current - 1;
                ans = Math.max(ans, lastElement - num+1);
            }
        }
        return ans;
    }
}
