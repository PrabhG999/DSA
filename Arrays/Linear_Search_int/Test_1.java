package Arrays.Linear_Search_int;

import java.util.Arrays;

public class Test_1 {
    public static int lin_search(int[] nums, int target) {

        int size = nums.length;

        for (int i = 0; i <= size; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return target;
    }
    public static int bin_Search(int []nums,int target){
        //will try using bubble sorted to sort the array !
        int size = nums.length;
        int temp =0;
        int right =size-1;
        int left = 0;
        int middle;
        for(int i =0;i<size;i++){
            for (int j =0;j<size-1;j++){
                //sort check
                if(nums[j]>nums[j+1]){ //bubble sort
                    temp = nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp; //swap
                }
            }
            System.out.println("Sorted Array "+ Arrays.toString(nums));
        }
        while(left<=right){      //binary search
            middle=(left+right)/2;

            if(nums[middle]==target){
                return middle;
            } else if (nums[middle]<target) {
                left = middle +1;
            }else{
                right = middle -1;
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {21, 34, 15, 89, 56, 78, 17, 45, 99, 11}; // Example sequence of numbers
        int target = 45; // Example secret number

        int result = lin_search(nums, target);
        int result_2 = bin_Search(nums, target);

        if (result == -1) {
            System.out.println("Secret number not found in the sequence.");
        } else {
            System.out.println("Secret number found at index: " + result);
            System.out.println("Secret number found at index: " + result_2);
        }
    }
}
