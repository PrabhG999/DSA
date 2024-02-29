package TEST_3;

import java.util.*;

public class Daily_Temprature {
    public static void main(String[] args) {
        // Test cases
        int[] temperatures1 = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] temperatures2 = {30, 40, 50, 60};
        int[] temperatures3 = {30, 60, 90};

        // Test case 1
        System.out.println("Example 1:");
        System.out.println("Input: " + Arrays.toString(temperatures1));
        int[] result1 = dailyTemperatures(temperatures1);
        System.out.println("Output: " + Arrays.toString(result1));

        // Test case 2
        System.out.println("\nExample 2:");
        System.out.println("Input: " + Arrays.toString(temperatures2));
        int[] result2 = dailyTemperatures(temperatures2);
        System.out.println("Output: " + Arrays.toString(result2));

        // Test case 3
        System.out.println("\nExample 3:");
        System.out.println("Input: " + Arrays.toString(temperatures3));
        int[] result3 = dailyTemperatures(temperatures3);
        System.out.println("Output: " + Arrays.toString(result3));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        // Implement your solution for daily temperatures here
        // Your code here
        int len = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int result[] = new int[len];
        for (int index = len - 1; index >= 0; index--) {
            if (!st.isEmpty() && temperatures[index] >= temperatures[st.peek()]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                result[index] = st.peek() - index;
            }
            st.push(index);
        }
        return result; // Placeholder return, replace with actual implementation
    }
}
