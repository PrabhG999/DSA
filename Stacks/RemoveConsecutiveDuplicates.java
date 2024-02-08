package Stacks;

import java.util.*;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        // Test cases
        int[] testArray1 = {1, 2, 2, 3, 3, 3, 4, 4, 5, 6}; // With k = 2
        int[] testArray2 = {1, 1, 1, 2, 2, 2, 3, 3, 3}; // With k = 2

        System.out.println("Original Array 1: " + Arrays.toString(testArray1));
        int[] result1 = removeConsecutiveDuplicates(testArray1);
        System.out.println("Array 1 After Removing Consecutive Duplicates: " + Arrays.toString(result1));

        System.out.println("Original Array 2: " + Arrays.toString(testArray2));
        int[] result2 = removeConsecutiveDuplicates(testArray2);
        System.out.println("Array 2 After Removing Consecutive Duplicates: " + Arrays.toString(result2));
    }

    private static int[] removeConsecutiveDuplicates(int[] nums) {
        int lenght = nums.length;
        //for the edge cases
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < lenght; i++) {
            if(stack.isEmpty() || stack.peek() != nums[i]){stack.push(nums[i]);}
            else if (stack.peek()==nums[i]) {
                if(i==lenght-1 ||nums[i]!= nums[i+1]){
                    stack.pop();
                }
            }
        }
        int result[] = new int[stack.size()];
        int length = result.length;
        for (int j = length - 1; j >= 0; j--) {
            result[j] = stack.pop();
        }
        return result;
    }
}
