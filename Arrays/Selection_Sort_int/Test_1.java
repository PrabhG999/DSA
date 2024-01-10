package Arrays.Selection_Sort_int;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test_1 {

    public static int bin_Search(int[] nums, int target) {

        //implementing selelction sort

        int size = nums.length;
        int midIndex;
        int temp;
        int middle;
        int left =0;
        int right = size-1;
        for(int i =0;i<size-1;i++){
            //set midindex to i
            midIndex=i;
            for(int j =i+1;j<size;j++){
                //finding min number logic here
                if(nums[j]<nums[midIndex]){
                    midIndex=j;     //lets say if nums[j] 206<nums[minIdenx] 832 then swap the places
                }
            }
            temp = nums[midIndex];
            nums[midIndex]=nums[i];
            nums[i]=temp;
            System.out.println("Selection sort happening here - "+ Arrays.toString(nums));
            //swapping logic here
        }
        //applying binary search
        while(left<=right){
            middle = (left+right)/2;

            if(nums[middle]==target){
                return middle;
            } else if (nums[middle]<target) {
                left = middle +1;
            }
            else{
                right = middle-1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] nums = {
                832, 206, 485, 977, 764, 793, 888, 615, 164, 501,
                730, 417, 354, 961, 655, 324, 813, 626, 343, 701,
                120, 452, 257, 718, 314, 990, 777, 991, 406, 305,
                940, 376, 201, 984, 149, 293, 271, 630, 912, 812,
                322, 572, 364, 412, 305, 559, 782, 231, 668, 757,
                159, 433, 965, 531, 996, 529, 897, 948, 618, 2,
                507, 544, 689, 669, 59, 775, 727, 296, 312, 799,
                88, 951, 768, 546, 436, 248, 222, 701, 674, 709,
                448, 294, 911, 682, 373, 721, 977, 899, 225, 523,
                839, 887, 133, 818, 831, 307, 612, 773, 328, 785
        }; // Example sequence of numbers
        int target = 777; // Example secret number

        int result = bin_Search(nums, target);

        if (result == -1) {
            System.out.println("Secret number not found in the sequence.");
        } else {
            System.out.println("Secret number found at index: " + result);
        }
    }
}
