package Arrays.Bin_Search_int;

public class BinSearch {
    public static void main(String[] args) {
        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        int target1 = 9;
        System.out.println(search(nums1, target1)); // Expected output: 4

        int[] nums2 = {-1, 0, 3, 5, 9, 12};
        int target2 = 2;
        System.out.println(search(nums2, target2)); // Expected output: -1
    }

    private static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int middle = left + (right-left)/2;
            if(nums[middle] == target){
                return middle;
            }else if (nums[middle]<target){
                left= middle+1;
            }else{
                right = middle-1;
            }
        }
        return -1;
    }

}
