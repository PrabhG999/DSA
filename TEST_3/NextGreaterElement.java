package TEST_3;
import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] inputArray = {1,3,2,1,8,6,3,4};

        int[] result = nextGreaterElements(inputArray);

        System.out.println("Input Array: " + Arrays.toString(inputArray));
        System.out.println("Next Greater Elements: " + Arrays.toString(result));
    }

    private static int[] nextGreaterElements(int[] nums) {
        int length = nums.length;
        int result []= new int[length];
        Arrays.fill(result,-1);

        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<length;i++){
            if(!stack.isEmpty() && nums[i]>nums[stack.peek()]){
                int index = stack.pop();
                nums[index]= result[i];
            }
            stack.push(i);
        }
        return result;
    }
}
