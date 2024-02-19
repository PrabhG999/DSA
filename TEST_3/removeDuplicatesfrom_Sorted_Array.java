package TEST_3;

public class removeDuplicatesfrom_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 5, 5}; // Example input array
        int[] expectedNums = {1, 2, 3, 4, 5}; // The expected answer with correct length

        int k = removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
        System.out.println("Number of unique elements: " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }


    public static int removeDuplicates(int[] nums) {
        // Your solution here
        int j =0;
        for(int i =0;i< nums.length;i++){
            if(nums[j]!=nums[i]){
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1; // Placeholder return value
    }
}
