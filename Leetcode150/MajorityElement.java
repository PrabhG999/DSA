package Leetcode150;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {3, 2, 3};
        System.out.println("Example 1 Output: " + majorityElement(nums1)); // Output: 3

        // Example 2
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Example 2 Output: " + majorityElement(nums2)); // Output: 2
    }

    public static int majorityElement(int[] nums) {
        // Your implementation here
        HashMap<Integer,Integer> map = new HashMap<>();    //alternate way
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.getOrDefault(num,0)+1);
            }else{
                map.put(num,1);
            }
        }
        int majority = nums.length/2;
        for(int key:map.keySet()){
            if(map.get(key)>majority){
                return key;
            }
        }
        return -1;
    }
}
/*int majority = nums[0];    (fastest)
        int count = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==majority){
                count +=1;
            }else{
                count-=1;
                if(count==0){
                    nums[i]=majority;
                    count =1;
                }
            }
        }
        return majority; // Placeholder return value*/