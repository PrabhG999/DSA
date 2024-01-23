package TEST_3;
import java.util.Arrays;

public class RemoveDuplicatesAndSortDescending {
    public static int[] removeDuplicatesAndSortDescending(int[] arr) {
        int newLen = removeDupes(arr);

        // Step 2: Create a new array with unique elements
        int[] uniqueArr = Arrays.copyOf(arr, newLen);

        // Step 3: Sort the new array in descending order
        Arrays.sort(uniqueArr);
        reverseArr(uniqueArr);

        return uniqueArr;
    }

    private static void reverseArr(int[] arr) {

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }


    private static int removeDupes(int[] arr) {
        int newLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                arr[newLength] = arr[i];
                newLength++;
            }
        }
        return newLength;
    }

    private static void insertSort(int[] arr) {
        for(int i=1;i< arr.length;i++){
            int key = arr[i];
            int j =i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        // Test cases
        int[] test1 = {5, 2, 9, 1, 5, 6};
        int[] result1 = removeDuplicatesAndSortDescending(test1);
        System.out.println("Test 1: " + Arrays.toString(result1)); // Expected output: [9, 6, 5, 2, 1]

        int[] test2 = {8, 4, 1, 7, 3, 9, 4};
        int[] result2 = removeDuplicatesAndSortDescending(test2);
        System.out.println("Test 2: " + Arrays.toString(result2)); // Expected output: [9, 8, 7, 4, 3, 1]

        int[] test3 = {12, 11, 13, 5, 6, 12, 6};
        int[] result3 = removeDuplicatesAndSortDescending(test3);
        System.out.println("Test 3: " + Arrays.toString(result3)); // Expected output: [13, 12, 11, 6, 5]
    }
}

