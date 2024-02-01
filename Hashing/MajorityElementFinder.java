package Hashing;

import java.util.*;

public class MajorityElementFinder {
    public static void main(String[] args) {
        // Test cases
        int[] test1 = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int[] test2 = {1, 2, 3, 4, 5, 5, 5};
        int[] test3 = {1, 1, 1, 2, 2, 2, 2};
        int[] test4 = {1, 2};
        int[] test5 = {2, 2, 1, 1, 1, 2, 2};

        // Processing and Output
        System.out.print("Majority Element in test1: ");
        findMajorityElement(test1); // Output is handled inside the method
        System.out.print("Majority Element in test2: ");
        findMajorityElement(test2);
        System.out.print("Majority Element in test3: ");
        findMajorityElement(test3);
        System.out.print("Majority Element in test4: ");
        findMajorityElement(test4);
        System.out.print("Majority Element in test5: ");
        findMajorityElement(test5);
    }

    private static void findMajorityElement(int[] nums) {
        int n = nums.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            } else {
                map.put(nums[i], i);
            }
        }
        for (int key : map.keySet()) {
            if (key > n) {
                System.out.println(key);
            }
        }
    }
}
