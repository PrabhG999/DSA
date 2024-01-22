package TEST_3;

import java.util.Arrays;

public class PairWithTargetSum {
    public static void main(String[] args) {
        // Test cases for findPairWithTargetSum
        System.out.println(Arrays.toString(findPairWithTargetSum(new int[]{1, 2, 3, 4, 6}, 6)));
        System.out.println(Arrays.toString(findPairWithTargetSum(new int[]{2, 5, 9, 11}, 11)));
        System.out.println(Arrays.toString(findPairWithTargetSum(new int[]{1, 2, 3, 4, 6}, 10)));
    }

    private static int[] findPairWithTargetSum(int[] ints, int i) {

        int left = 0;
        int right = ints.length - 1;
        while (left < right) {
            int sum = ints[left] + ints[right];
            if (sum == i) {
                return new int[]{left, right};
            } else if (sum < i) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }


}
