package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class SmallerNumbersThanCurrent {

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {8,1,2,2,3};
        int[] nums2 = {6,5,4,8};
        int[] nums3 = {7,7,7,7};

        // Processing and Output
        System.out.println("Output for [8,1,2,2,3]: " + arrayToString(smallerNumbersThanCurrent(nums1)));
        System.out.println("Output for [6,5,4,8]: " + arrayToString(smallerNumbersThanCurrent(nums2)));
        System.out.println("Output for [7,7,7,7]: " + arrayToString(smallerNumbersThanCurrent(nums3)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] sorted = nums.clone();
        sortingMerge(sorted,0,nums.length-1);

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<sorted.length;i++){
            map.putIfAbsent(sorted[i],i);
        }
        int result[]= new int [nums.length];
        for(int i=0;i< nums.length;i++){
            result[i]= map.get(nums[i]);
        }
        return result;
    }

    private static int[] sortingMerge(int[] nums,int left,int right) {
        if(left<right){
            int middle = left+(right-left)/2;

            sortingMerge(nums,left,middle);
            sortingMerge(nums,middle+1,right);
            merging(nums,left,middle,right);
        }
        return nums;
    }

    private static void merging(int[] nums, int left, int middle, int right) {
        int []merge = new int[right-left+1];
        int x=0;
        int indx1 =left;
        int indx2 =middle+1;
        while(indx1<=middle && indx2<=right){
            if(nums[indx1]<=nums[indx2]){
                merge[x++]= nums[indx1++];
            }else {
                merge[x++]= nums[indx2++];
            }
        }
        while(indx1<=middle){
            merge[x++]= nums[indx1++];
        }
        while(indx2<=right){
            merge[x++]= nums[indx2++];
        }
        for(int i=0,j=left;i<merge.length;i++,j++){
            nums[j]=merge[i];
        }
    }

    // Helper method to convert array to string for easy printing
    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
