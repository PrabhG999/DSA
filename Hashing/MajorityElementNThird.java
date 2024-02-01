package Hashing;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementNThird {
    public static void main(String[] args) {
        int[] test1 = {3, 2, 3};
        int[] test2 = {1, 2, 3, 4};
        int[] test3 = {2, 2, 1, 3, 1, 4, 1, 3};

        System.out.print("Elements appearing more than n/3 times in test1: ");
        findMajorityNThird(test1);
        System.out.print("Elements appearing more than n/3 times in test2: ");
        findMajorityNThird(test2);
        System.out.print("Elements appearing more than n/3 times in test3: ");
        findMajorityNThird(test3);
    }

    private static void findMajorityNThird(int[] nums) {
        int n = nums.length/3;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            }else {
                map.put(nums[i],i);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                System.out.println(entry.getKey());
            }
        }
    }
}
