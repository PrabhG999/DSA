package Arrays.Bin_lin_search_with_steps;

public class BIn_Lin_search_with_steps {

    public static int linearSearch(int []sequence,int target){

        int len = sequence.length;
        int steps = 0;
        for(int i =0;i<=len;i++){
            steps ++;
            if(sequence[i]==target){
                System.out.println("The number of steps to calculate linear seach is " + steps);
                return i;
            }
        }
        System.out.println("The number of steps to calculate linear search is " + steps);
        return -1;
    }
    public static int binarySearch(int []sequence,int target){
        //binary serch works in O(log n ) logrithimic time which is faster than O(1) Constant time but slower than O(n) - linear time
        int left =0;
        int right = sequence.length-1;
        int steps = 0;
        while(left<=right){
            steps ++;
            int mid = (left +right)/2;

            if(sequence[mid]==target){
                System.out.println("The number of steps to calculate Binary search is " + steps);
                return mid;
            }
            else if(sequence[mid]<=target){
                left = mid+1;
            }
            else{
                right = mid -1;
            }
        }
        System.out.println("The number of steps to calculate linear Binary is " + steps);
        return -1;
    }

    public static void main(String[] args) {
        int[] sequence = {3, 5, 7, 9, 11, 11, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99}; // Example sequence of numbers
        int target = 9; // Example target number

        int result = linearSearch(sequence, target);
        int result2 = binarySearch(sequence, target);

        if (result == -1) {
            System.out.println("Secret number not found in the sequence.");
        } else {
            System.out.println("Secret number for Linear Search found at index: " + result);
            System.out.println("Secret number for Binary Search found at index: " + result2);
        }
    }
}
