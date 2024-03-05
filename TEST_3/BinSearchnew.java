package TEST_3;

import java.util.Arrays;

public class BinSearchnew {
    public static void main(String[] args) {
        // Create an unsorted array of integers
        int[] array = {5, 3, 9, 1, 7, 4, 8, 2, 6};

        // Target value to search for
        int target = 7;

        // Call the search method to find the target in the array
        int index = Bin(array, target);

        // Print the result
        if (index != -1) {
            System.out.println("Target " + target + " found at index " + index);
        } else {
            System.out.println("Target " + target + " not found in the array");
        }
    }

    private static int Bin(int[] array, int target) {
        Arrays.sort(array);
        int left =0;
        int right = array.length-1;
        while(left<=right){
            int middle = left+(right-left);
            if(array[middle]==target){
                return middle;
            }else if (array[middle]<target){
                left= middle +1;
            }else{
                right =middle-1;
            }
        }
        return left;
    }
}
