package TEST_3;

import java.util.*;

public class TWOPointerII {
    public static void main(String[] args) {
        // Example 1
        int[] numbers1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Example 1 Output: " + Arrays.toString(twoSum(numbers1, target1))); // Output: [1, 2]

        // Example 2
        int[] numbers2 = {2, 3, 4};
        int target2 = 6;
        System.out.println("Example 2 Output: " + Arrays.toString(twoSum(numbers2, target2))); // Output: [1, 3]

        // Example 3
        int[] numbers3 = {-1, 0};
        int target3 = -1;
        System.out.println("Example 3 Output: " + Arrays.toString(twoSum(numbers3, target3))); // Output: [1, 2]
    }

    public static int[] twoSum(int[] numbers, int target) {
       int left =0;
       int right = numbers.length-1;
       int result [] = new int[2];
       while(left<right){
           int sum= numbers[left]+ numbers[right];
           if(sum==target){
               return new int[]{left+1,right+1};
           } else if (sum<target) {
               left++;
           }else{
               right--;
           }
       }
        return new int []{-1,-1};
    }
}
// Your implementation here  slow approach

        /*for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length-1; j >i; j--) {
                 int sum = numbers[i] + numbers[j];
                 if(sum == target){
                     return new int []{i+1,j+1};
                 }
            }
        }
        return new int[]{-1, -1}; // Placeholder return value*/