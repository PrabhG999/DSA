package Arrays.Two_pointer;

public class ArrayReversalTest_Test {
    public static void main(String[] args) {
        testReverseArray(new int[]{1, 2, 3, 4, 5});       // Test case 1
        testReverseArray(new int[]{9, 8, 7, 6});          // Test case 2
        testReverseArray(new int[]{5});                   // Test case 3, single element
        testReverseArray(new int[]{});                    // Test case 4, empty array
        testReverseArray(new int[]{12, 34, 56, 78, 90});  // Test case 5
    }

    private static void testReverseArray(int[] arr) {
        System.out.println("Original array: " + arrayToString(arr));
        reverseArray(arr);
        System.out.println("Reversed array: " + arrayToString(arr));
        System.out.println(); // Blank line for readability
    }

    private static void reverseArray(int[] arr) {
       int left =0;
       int right = arr.length-1;
       while(left<right){
           swap(arr,left,right);
           left++;
           right--;
       }
    }
    private static void swap(int []arr,int left,int right){
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
