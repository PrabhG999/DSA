package TEST_3;
import java.util.Arrays;

public class SearchAlgorithms {
    public static int linearSearch(int[] arr, int elementToSearch) {
        // TODO: Implement linear search logic and return the index of elementToSearch, or -1 if not found

        int len = arr.length;
        for(int i =0;i<len;i++){
            if(arr[i]==elementToSearch){
                return i;  //to return index
            }
        }
        return -1; // Placeholder return statement
    }
    public static int binarySearch(int[] arr, int elementToSearch) {
        // Make sure to sort the array before performing binary search
        Arrays.sort(arr);
        // TODO: Implement binary search logic and return the index of elementToSearch, or -1 if not found
        int len = arr.length;
        int l=0 ;
        int r = len-1;
        int middle;
        while(l<=r){
            middle =(l+r)/2;
            if(arr[middle]==elementToSearch){
                return middle;
            }else if(arr[middle]<elementToSearch){
                l = middle +1;
            }else{
                r = middle -1;
            }
        }

        return -1; // Placeholder return statement
    }
    public static void main(String[] args) {
        // Test cases for linear search
        System.out.println(linearSearch(new int[]{1, 3, 5, 7, 9}, 3)); // Should return 1
        System.out.println(linearSearch(new int[]{10, 23, 45, 70, 11, 15}, 70)); // Should return 3
        System.out.println(linearSearch(new int[]{90, 23, 5, 109, 12, 22, 67, 34}, 12)); // Should return 4
        System.out.println(linearSearch(new int[]{5, 3, 8, 4, 2}, 7)); // Should return -1

        // Test cases for binary search
        System.out.println(binarySearch(new int[]{2, 4, 6, 8, 10}, 6)); // Should return 2
        System.out.println(binarySearch(new int[]{5, 6, 7, 8, 9, 10}, 9)); // Should return 4
        System.out.println(binarySearch(new int[]{1, 22, 34, 47, 53, 66, 78, 89, 90}, 47)); // Should return 3
        System.out.println(binarySearch(new int[]{1, 2, 3, 4, 5}, 0)); // Should return -1
    }
}
