package Stacks;

import java.util.Stack;

class MinStack {
    private  int min;
    Stack<Integer> st;    //= new Stack<>(); same thing 1
    public MinStack() {
        min= Integer.MAX_VALUE;
        st=new Stack<>();   //same thing 1.1
    }

    public void push(int x) {
        if(x<min){
            st.push(min);
        }
        st.push(x);
    }

    public void pop() {
        if(st.pop()==min){
            min = st.pop();
        }
    }

    public int top() {
       return st.peek();
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */