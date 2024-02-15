package SlidingWindow;

public class MaximumInSubarray {
    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k1 = 3;
        System.out.println("Test case 1 Output:"); //Output: 3 3 4 5 5 5 6
        printMaxOfSubarrays(arr1, k1);
        System.out.println();
        // Test case 2
        int[] arr2 = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        int k2 = 4;
        System.out.println("Test case 2 Output:"); //Output: 10 10 10 15 15 90 90
        printMaxOfSubarrays(arr2, k2);
    }

    private static void printMaxOfSubarrays(int[] arr, int k) {
       int size= arr.length;
       for(int i=0;i<size-k+1;i++){
           int max = arr[i];
           for(int j =1;j<k;j++){
               if(arr[i+j]>max){
                   max = arr[i+j];
               }
           }
           System.out.print(max+ " ");
       }
    }
}
