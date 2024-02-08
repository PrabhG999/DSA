package TEST_3;
import java.util.*;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        // Test cases
        int[] testArray1 = {1, 2, 2, 3, 4, 4, 5};
        int[] testArray2 = {3, 3, 3, 3, 3};
        int[] testArray3 = {1, 2, 3, 4, 5};
        int[] testArray4 = {};

        System.out.println("Original Array 1: " + Arrays.toString(testArray1));
        int[] result1 = removeDuplicates(testArray1);
        System.out.println("Array 1 After Removing Duplicates: " + Arrays.toString(result1));

        System.out.println("Original Array 2: " + Arrays.toString(testArray2));
        int[] result2 = removeDuplicates(testArray2);
        System.out.println("Array 2 After Removing Duplicates: " + Arrays.toString(result2));

        System.out.println("Original Array 3: " + Arrays.toString(testArray3));
        int[] result3 = removeDuplicates(testArray3);
        System.out.println("Array 3 After Removing Duplicates: " + Arrays.toString(result3));

        System.out.println("Original Empty Array: " + Arrays.toString(testArray4));
        int[] result4 = removeDuplicates(testArray4);
        System.out.println("Empty Array After Removing Duplicates: " + Arrays.toString(result4));
    }

    private static int[] removeDuplicates(int[] testArray1) {
        if (testArray1 == null || testArray1.length == 0) {
            return new int[0]; // Return an empty array if input is null or empty
        }
        int length = testArray1.length;
        int i =0;
        for(int j =1;j<length;j++){
            if(testArray1[j]!= testArray1[i]){
                i++;
                testArray1[i]=testArray1[j];
            }
        }
         int[] result  = Arrays.copyOf(testArray1,i+1);
        return result;
    }
}
