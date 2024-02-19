package TEST_3;

public class removeDuplicatesfrom_Sorted_Array_2 {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 2, 2, 3}; // Example input array 1
        int[] expectedNums1 = {1, 1, 2, 2, 3}; // The expected answer with correct length 1

        int k1 = removeDuplicates(nums1); // Calls your implementation for example 1

        assert k1 == expectedNums1.length;
        for (int i = 0; i < k1; i++) {
            assert nums1[i] == expectedNums1[i];
        }
        System.out.println("Number of unique elements in example 1: " + k1);
        System.out.print("Array after removing duplicates in example 1: ");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        int[] nums2 = {0, 0, 1, 1, 1, 1, 2, 3, 3}; // Example input array 2
        int[] expectedNums2 = {0, 0, 1, 1, 2, 3, 3}; // The expected answer with correct length 2

        int k2 = removeDuplicates(nums2); // Calls your implementation for example 2

        assert k2 == expectedNums2.length;
        for (int i = 0; i < k2; i++) {
            assert nums2[i] == expectedNums2[i];
        }
        System.out.println("Number of unique elements in example 2: " + k2);
        System.out.print("Array after removing duplicates in example 2: ");
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");
        }
    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int j = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[j - 2] != nums[i]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
