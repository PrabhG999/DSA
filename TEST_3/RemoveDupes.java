package TEST_3;
import java.util.Arrays;

public class RemoveDupes {
    public static int[] removeDuplicates(int[] arr) {
        // Your code to remove duplicates goes here
        //will be using two pointers for this question
        int i= 0;
        for(int j =1;j< arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }

        }
        //new array
        int result[]= Arrays.copyOf(arr,i+1);
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        int[] test1 = {1, 2, 2, 3, 4, 4, 5};
        int[] result1 = removeDuplicates(test1);
        System.out.println("Test 1: " + Arrays.toString(result1)); // Expected output: [1, 2, 3, 4, 5]

        int[] test2 = {5, 5, 6, 6, 7, 7, 8, 8};
        int[] result2 = removeDuplicates(test2);
        System.out.println("Test 2: " + Arrays.toString(result2)); // Expected output: [5, 6, 7, 8]

        int[] test3 = {1, 2, 3, 4, 5};
        int[] result3 = removeDuplicates(test3);
        System.out.println("Test 3: " + Arrays.toString(result3)); // Expected output: [1, 2, 3, 4, 5]
    }
}
