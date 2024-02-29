package TEST_3;

import java.util.*;

public class IntersectionOf2Arrays {
    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result1 = intersection(nums1, nums2);
        System.out.println("Test Case 1 Output: " + Arrays.toString(result1)); // Expected output: [2]

        // Test Case 2
        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        int[] result2 = intersection(nums3, nums4);
        System.out.println("Test Case 2 Output: " + Arrays.toString(result2)); // Expected output: [9, 4] or [4, 9]
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> resList = new ArrayList<>();

        for (int digit : nums1) {
            map.put(digit, map.getOrDefault(digit, 0) + 1);
        }
        for (int digit : nums2) {
            if (map.containsKey(digit) && !resList.contains(digit)) {
                resList.add(digit);
                map.put(digit, map.get(digit - 1));
            }
        }
        int result[] = new int[resList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = resList.get(i);
        }
        return result;
    }
}
