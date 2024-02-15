package Stacks;

import java.util.Stack;

public class MinStackII {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();

    /*public MinStackII() {
        Dont need Constructor because we are using 2 stacks
    }*/

    public void push(int val) {
        if(min.isEmpty() || val<min.peek()){
            min.push(val);
        }
        stack.push(val);
    }

    public void pop() {
       if(!stack.isEmpty()){
           if(min.peek().equals(stack.peek())){
               min.pop();
           }
       }
       stack.pop();
    }

    public int top() {
         return stack.peek();
    }

    public int getMin() {
        if(!min.isEmpty()) {
            return min.peek();
        }
        throw new RuntimeException("Stack is Empty");
    }
}
