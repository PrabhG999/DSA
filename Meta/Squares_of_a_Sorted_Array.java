package Meta;

public class Squares_of_a_Sorted_Array {
    private void sorting(int[] sort, int length) {
        //using selection sort
        for(int i=0;i<length;i++){
            int minIndex = i;
            for(int j=i+1;j<length-1;j++){
                if(sort[j]<sort[minIndex]){
                    minIndex=j;
                }
            }
            swap(sort,minIndex,i);
        }

    }

    private void swap(int[] sort, int minIndex, int i) {
        int temp = sort[minIndex];
        sort[minIndex]=sort[i];
        sort[i]=temp;
    }

    private int[] sortedSquares(int[] nums) {
        int size = nums.length;
        int [] sort = new int[size];

        for(int i=0;i<size;i++){
            sort[i]= nums[i]*nums[i]; //square each element of the array
        }
        sorting(sort,sort.length);
        return sort;
    }

    // Main method with test cases
    public static void main(String[] args) {
        test(new int[]{-4, -1, 0, 3, 10});   // Mixed negative and positive
        test(new int[]{1, 2, 3, 4, 5});      // All positive
        test(new int[]{-5, -4, -3, -2, -1}); // All negative
        test(new int[]{0, 0, 0, 0});         // All zeros
        test(new int[]{2});                  // Single element
    }

    // Helper method for running and printing test cases
    private static void test(int[] nums) {
        System.out.println("Original array: ");
        printArray(nums);
        int[] result = new Squares_of_a_Sorted_Array ().sortedSquares(nums);
        System.out.println("Squared and sorted array: ");
        printArray(result);
        System.out.println(); // Blank line for readability
    }

    // Utility method to print an array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
