package TEST_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println("Example 1 Output: " + threeSum(nums1)); // Output: [[-1,-1,2],[-1,0,1]]

        // Example 2
        int[] nums2 = {0, 1, 1};
        System.out.println("Example 2 Output: " + threeSum(nums2)); // Output: []

        // Example 3
        int[] nums3 = {0, 0, 0};
        System.out.println("Example 3 Output: " + threeSum(nums3)); // Output: [[0,0,0]]
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        // Your implementation here
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        sorting(nums, nums.length);
        /*System.out.println(Arrays.toString(nums));*/
        int target = 0;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;  // Skip duplicate elements
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
                    while(left<right && nums[left]==nums[left+1]){
                        left ++;
                    }
                    while(left<right && nums[right]==nums[right-1]){
                        right --;
                    }
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return new ArrayList<>(result); // Placeholder return value
    }

    private static void sorting(int[] nums, int length) {

        for (int i = 1; i < length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }

    }
}
