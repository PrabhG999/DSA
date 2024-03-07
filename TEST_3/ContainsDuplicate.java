package TEST_3;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println(containsDuplicate(nums1)); // Output: true
        System.out.println(containsDuplicate(nums2)); // Output: false
        System.out.println(containsDuplicate(nums3)); // Output: true
    }

    private static boolean containsDuplicate(int[] nums) {       //using a hashmap
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<= nums.length-1;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1 ); //if mao has the key update the frequency!
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
