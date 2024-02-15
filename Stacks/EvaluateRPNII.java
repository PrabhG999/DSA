package Stacks;

import java.util.Stack;

public class EvaluateRPNII {
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
        for (String t : tokens) {
            switch (t) {
                case "+":
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a+b);
                    break;

                case "-":
                    int c = stack.pop();
                    int d = stack.pop();
                    stack.push(d-c);
                    break;

                case "*":
                    int e = stack.pop();
                    int f = stack.pop();
                    stack.push(e*f);
                    break;

                case "/":
                    int g = stack.pop();
                    int h = stack.pop();
                    stack.push(h/g);
                    break;
                default:
                    stack.push(Integer.parseInt(t));
            }

        }
        return stack.pop();
    }
}
