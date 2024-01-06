package Arrays.Bubble_sort;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Bubble_Sort_2_int {

    public static void bubbleSort(int []nums){
        int size = nums.length;
        int temp;


        System.out.println("The unsorted Array"+ Arrays.toString(nums));
        System.out.println();
        System.out.println("Sorting below .....");
        for(int i =0;i<size;i++){
            for(int j =0;j<size -1;j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {47, 22, 15, 67, 54, 36, 19, 73, 56, 81, 3, 30, 65, 89, 10};


        bubbleSort(nums);

        System.out.println("Sorted array is " + Arrays.toString(nums));
    }
}
