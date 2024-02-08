package Stacks;

import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args) {
        // Test cases
        String[] testStrings = {
                "([])",          // Balanced
                "{[()]}",        // Balanced
                "({[]})",        // Balanced
                "([)]",          // Not balanced
                "{[()}",         // Not balanced
                "({[}])",        // Not balanced
                "(",             // Not balanced
                ")",             // Not balanced
                "",              //  NOT Balanced (no brackets)
        };

        for (String testString : testStrings) {
            boolean result = areBracketsBalanced(testString);
            if (result) {
                System.out.println("Balanced: " + testString);
            } else {
                System.out.println("Not Balanced: " + testString);
            }
        }
    }

    private static boolean areBracketsBalanced(String testString) {
        Stack<Character> stack = new Stack<>();
        int length = testString.length();

        for(int i= 0;i<length;i++){
            char ch = testString.charAt(i);    //every current element of i
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((ch == ')' && top != '(') ||  (ch == '}' && top != '{') || (ch == ']' && top != '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
