package Arrays.Selection_Sort_int;

import java.util.Arrays;

public class Selection_sort_2 {
    public static void selectionSort2(int []nums){


        int size =nums.length;
        int index;
        int temp;
        int operation=0;

        if(size==1){
            System.out.println("Array already Sorted");
        }

        for(int i=0;i<size-1;i++){
            index =i;
            for(int j=i+1;j<size;j++){
                //swap for min
                if(nums[j]<nums[index]){
                    index =j;
                }
            }
            //sorting using temp
            temp = nums[index];
            nums[index]=nums[i];
            nums[i]=temp;
            System.out.println("Sorting  " + operation++ + " "+ Arrays.toString(nums));
        }

    }
    public static void main(String[]args){
        int[] nums = {57, 22, 93, 5, 78, 12, 36, 68, 41, 9, 63, 17, 88, 34, 72, 49, 30, 25, 81, 52};
        System.out.println("Unsorted Array before selctionSort"+ Arrays.toString(nums));
        selectionSort2(nums);
        System.out.println();
    }
}
