package Arrays.Bubble_sort;

import java.util.Arrays;

public class Bubble_sort1 {
    public static void main(String[] args) {
        int[] nums = {5, 8, 3, 4, 9, 0, 2};

        bubbleSort(nums);

        System.out.println("Sorted array is " + Arrays.toString(nums));
    }

    public static void bubbleSort(int[] nums) {

        int size = nums.length;
        int temp ;

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size -i- 1; j++) {

                if (nums[j] > nums[j + 1]) {// for instance comparing 5>8 checking that if not then below
                    temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;

                }
            }

        }
    }
}
