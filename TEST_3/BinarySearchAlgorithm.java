package TEST_3;

public class BinarySearchAlgorithm {

    public static void main(String[] args) {
        // Test cases for binarySearch
        System.out.println(binarySearch(new int[]{1, 3, 5, 7, 9}, 5)); // Should return 2
        System.out.println(binarySearch(new int[]{10, 20, 30, 40, 50}, 40)); // Should return 3
        System.out.println(binarySearch(new int[]{100, 200, 300, 400, 500}, 100)); // Should return 0
        System.out.println(binarySearch(new int[]{15, 22, 34, 67, 89, 123}, 68)); // Should return -1
    }

    // Method to implement
    public static int binarySearch(int[] sortedArray, int targetValue) {
        // TODO: Implement the binary search algorithm
        int left=0;
        int right = sortedArray.length-1;
        while(left<=right){
            int middle =(left+right)/2;
            if(sortedArray[middle]==targetValue){
                return middle;
            } else if (sortedArray[middle]<targetValue) {
                left =middle+1;
            }else {
                right =middle-1;
            }
        }

        return -1; // Placeholder return statement
    }
}

