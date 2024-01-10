package Arrays.Two_pointer;

public class Two_Pointer_int1 {
    public static int[] findTwoSum(int[] array, int target) {
       int left =0;
       int right = array.length-1;
       while(left<right){
           if((array[left]+array[right])==target){
               return new int []{left,right};
           }else if((array[left]+array[right])<target){
               left ++;
           }else {
               right --;
           }
       }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6}; // Example array
        int target = 6; // Example target

        int[] result = findTwoSum(array, target);
        if (result[0] != -1) {
            System.out.println("Pair found at indices: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No pair found that adds up to the target.");
        }
    }
}
