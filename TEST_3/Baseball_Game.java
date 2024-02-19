package TEST_3;

import java.util.Stack;

public class Baseball_Game {
    public static void main(String[] args) {
        String[] ops1 = {"5", "2", "C", "D", "+"};
        int score1 = calPoints(ops1);
        System.out.println("Example 1 Output: " + score1);
        // Expected Output: 30

        String[] ops2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        int score2 = calPoints(ops2);
        System.out.println("Example 2 Output: " + score2);
        // Expected Output: 27

        String[] ops3 = {"1", "C"};
        int score3 = calPoints(ops3);
        System.out.println("Example 3 Output: " + score3);
        // Expected Output: 0
    }

    public static int calPoints(String[] ops) {
        // Implement your solution here
        int sum=0;
        Stack<Integer> st = new Stack<>();

        for(String op:ops){
            if(op.equals("+") && ops.length>=2 ){
                int a = st.pop();
                int b =st.peek();
                int c = a+b;
                st.push(a);
                st.push(c);
            }else if(op.equals("D") && !st.isEmpty()){
                int d = st.peek();
                st.push(d*2);
            } else if (op.equals("C") && !st.isEmpty()) {
                st.pop();
            }else {
                st.push(Integer.parseInt(op));
            }
        }
        while(!st.isEmpty()){
            sum+= st.pop();
        }
        return sum; // Placeholder
    }
}
