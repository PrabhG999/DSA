package Arrays.Selection_Sort_int;

import java.util.Arrays;

public class Selection_sort_1 {
    public static void selectionSort(int []nums){
        int size = nums.length;
        int minIndex;
        int temp;

        for(int i =0;i<size-1;i++){
            minIndex=i;

            for(int j =i+1;j<size;j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;     //finding min in nums and swapping
                }
            }
            //sorting by using temp
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
            System.out.println("Sorted array- "+Arrays.toString(nums));
        }
    }
    public static void main(String[]args){
        int[] nums = {100, 1, 82, 21, 32, 45, 59, 78, 89, 99};
        System.out.println("Unsorted Array before selctionSort"+ Arrays.toString(nums));
        selectionSort(nums);
        System.out.println();
    }

}
