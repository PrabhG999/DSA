package Arrays.Recursive_in_Bin_search;

public class Recusive_Bin_Search {

    public static int binarySearch(int []sequence,int target,int left, int right){
         if(left<=right){
             //find mid
             int mid = (left+ right)/2;
             if(sequence[mid]==target){
                 return mid;
             }
            else if(sequence[mid]<target){
                return binarySearch(sequence,target,mid+1,right);  // changed the left to mid +1 how done in regular binary search
             }
             else{
                return binarySearch(sequence,target,left,mid -1);  // changed the right to mid -1 how done in regular binary search
             }

         }
        return -1;
    }
    public static void main(String[] args) {
        int[] sequence = {3, 5, 7, 9, 11, 11, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99}; // Example sequence of numbers
        int target = 9; // Example target number

        int result = binarySearch(sequence, target,0,sequence.length-1);

        if (result == -1) {
            System.out.println("Secret number not found in the sequence.");
        } else {
            System.out.println("Secret number for Binary Search found at index: " + result);
        }
    }
}
