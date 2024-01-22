package TEST_3;
import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        // Test cases for mergeSortedArrays
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int[] nums2 = {2, 4, 6};
        int m = 3, n = 3;
        mergeSortedArrays(nums1, m, nums2, n);
        System.out.println("Merged array: " + Arrays.toString(nums1));

        int[] nums1b = {0};
        int[] nums2b = {1};
        mergeSortedArrays(nums1b, 0, nums2b, 1);
        System.out.println("Merged array: " + Arrays.toString(nums1b));
    }

    // Method to implement (you need to implement this method)
    public static void mergeSortedArrays(int[] nums1, int m, int[] nums2, int n) {
        // Implementation goes here
        //first sort them
        //then merge them!

        int index1 = m-1 ; //from the last of nums1
        int index2 = n-1; // from the last of nums2

        int mergedIndex = m+n-1;

        while(index1>=0 && index2>=0){
            if(nums1[index1]>nums2[index2]){
                nums1[mergedIndex]=nums1[index1];
                index1 --;
            }else{
                nums1[mergedIndex]=nums2[index2];
                index2--;
            }
            mergedIndex--;
        }
        while(index2>=0) {
            nums1[mergedIndex] = nums2[index2];
            index2--;
            mergedIndex--;
        }
    }
}

