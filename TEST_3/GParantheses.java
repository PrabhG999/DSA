package TEST_3;

import java.util.ArrayList;
import java.util.List;

public class GParantheses {
    public static void main(String[] args) {
        // Test cases
        int n1 = 3;
        int n2 = 1;
        List<String> result1 = new ArrayList<>();
        List<String> result2 = new ArrayList<>();
        // Test case 1
        System.out.println("Example 1:");
        System.out.println("Input: n = " + n1);
        generateParentheses("(", 1, 0, result1, n1);
        System.out.println("Output: " + result1);

        // Test case 2
        System.out.println("\nExample 2:");
        System.out.println("Input: n = " + n2);
        generateParentheses("(", 1, 0, result2, n2);
        System.out.println("Output: " + result2);
    }

    private static void generateParentheses(String current, int open, int close, List<String> result, int n) {
        if(current.length()==2*n){
            result.add(current);
            return;
        }
        if(open<n){
            generateParentheses(current +"(",open+1,close,result,n);
        }
        if(close<open){
            generateParentheses(current +")",open,close+1,result,n);
        }
    }


}
