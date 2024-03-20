package TEST_3;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicatesII {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int k1 = 3;

        int[] nums2 = {1, 0, 1, 1};
        int k2 = 1;

        int[] nums3 = {1, 2, 3, 1, 2, 3};
        int k3 = 2;

        System.out.println(containsNearbyDuplicate(nums1, k1)); // Output: true
        System.out.println(containsNearbyDuplicate(nums2, k2)); // Output: true
        System.out.println(containsNearbyDuplicate(nums3, k3)); // Output: false
    }

    /*private static boolean containsNearbyDuplicate(int[] nums, int k) {
        //uisng a HashMap
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int num=0;num<nums.length;num++){
            if(map.containsKey(nums[num])&& Math.abs(num-map.get(nums[num]))<=k){
                return true;
            }else {
                map.put(nums[num],num);
            }
        }
        return false;
    }*/
    private static boolean containsNearbyDuplicate(int[] nums, int k) {
        //uisng a HashSet Sliding window
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            //check if element resides inside set
            if (set.contains(nums[i])) {
                return true;
            }
            //make the sum of the elements in the set
            set.add(nums[i]);
            //if size of set is bigger than K remove the elements
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
