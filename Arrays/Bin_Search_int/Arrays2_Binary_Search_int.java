package Arrays.Bin_Search_int;

public class Arrays2_Binary_Search_int {
    public static int find(int []sequence, int target){
        int left =0;
        int right = sequence.length-1;

        while (left<=right){

            int mid = (left+right)/2;
            if(sequence[mid]== target){
                return mid;
            } else if (sequence[mid]<=target) {
                left = mid+1;
            }else {
                right = mid-1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] sequence = {3, 5, 7, 9, 11, 11, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99}; // Example sequence of numbers
        int target = 45; // Example secret number

        int result = find(sequence, target);

        if (result == -1) {
            System.out.println("Secret number not found in the sequence.");
        } else {
            System.out.println("Secret number found at index: " + result);
        }
    }
}
