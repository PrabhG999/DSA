package TEST_3;

public class TwoPointerExample {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] indices = findTwoSumIndices(nums, target);

        if (indices[0] != -1) {
            System.out.println("Indices: [" + indices[0] + ", " + indices[1] + "]"); // Expected output: Indices: [0, 1]
        } else {
            System.out.println("No solution found.");
        }
    }

    private static int[] findTwoSumIndices(int[] nums, int target) {

        int left =0;
        int right = nums.length-1;
        while(left<=right){
            int sum = nums[left]+nums[right];
            if(sum == target){
                return new int[]{left,right};
            } else if (sum<target) {
                left++;
            }else {
                right--;
            }
        }

        return new int []{-1,-1};
    }
}
