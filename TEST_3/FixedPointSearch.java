package TEST_3;

public class FixedPointSearch {

    public static void main(String[] args) {
        // Test cases for findFixedPoint
        System.out.println(findFixedPoint(new int[]{-10, -5, 0, 3, 7})); // Should return 3
        System.out.println(findFixedPoint(new int[]{0, 2, 5, 8, 17})); // Should return 0
        System.out.println(findFixedPoint(new int[]{-10, -1, 1, 3, 10})); // Should return 1
        System.out.println(findFixedPoint(new int[]{-10, -5, 3, 4, 7, 9})); // Should return -1
    }

    // Method to implement
    public static int findFixedPoint(int[] sortedArray) {
        // TODO: Implement the binary search algorithm to find the fixed point
        int left =0;
        int right = sortedArray.length-1;
        while(left<right){
            int mid = (left+right)/2;
            if(sortedArray[mid]==mid){
                return mid;
            } else if (sortedArray[mid]<mid) {
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1; // Placeholder return statement
    }
}

