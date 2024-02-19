package TEST_3;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3}; // Example input array 1
        int val1 = 3; // Value to remove in example 1
        int[] expectedNums1 = {2, 2}; // The expected answer with correct length 1

        int k1 = removeElement(nums1, val1); // Calls your implementation for example 1

        assert k1 == expectedNums1.length;
        for (int i = 0; i < k1; i++) {
            assert nums1[i] == expectedNums1[i];
        }
        System.out.println("Number of elements not equal to val in example 1: " + k1);
        System.out.print("Array after removing elements in example 1: ");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2}; // Example input array 2
        int val2 = 2; // Value to remove in example 2
        int[] expectedNums2 = {0, 1, 4, 0, 3}; // The expected answer with correct length 2

        int k2 = removeElement(nums2, val2); // Calls your implementation for example 2

        assert k2 == expectedNums2.length;
        for (int i = 0; i < k2; i++) {
            assert nums2[i] == expectedNums2[i];
        }
        System.out.println("Number of elements not equal to val in example 2: " + k2);
        System.out.print("Array after removing elements in example 2: ");
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");
        }
    }

    public static int removeElement(int[] nums, int val) {
        // Your solution here
        int j =0;
        for(int i=0;i< nums.length;i++){
            if(val!=nums[i]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j; // Placeholder return value
    }
}
