package Stacks;

import java.util.Stack;

public class EvaluateRPN {
    public static void main(String[] args) {
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(tokens1)); // Output: 9

        String[] tokens2 = {"4", "13", "5", "/", "+"};
        System.out.println(evalRPN(tokens2)); // Output: 6

        String[] tokens3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRPN(tokens3)); // Output: 22
    }

    private static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String c : tokens) {
            if (!"+-*/".contains(c)) {
                stack.push(Integer.parseInt(c));
            } else {
                int a = stack.pop();
                int b = stack.pop();
                switch (c) {
                    case "+":
                        int sum = a + b;
                        stack.push(sum);
                        break;
                    case "-":
                        int diff = b - a;
                        stack.push(diff);
                        break;
                    case "*":
                        int product = a * b;
                        stack.push(product);
                        break;
                    case "/":
                        int ques = b / a;
                        stack.push(ques);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
