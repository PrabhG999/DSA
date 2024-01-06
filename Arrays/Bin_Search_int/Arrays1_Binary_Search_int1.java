package Arrays.Bin_Search_int;

public class Arrays1_Binary_Search_int1 {


    public static int findSecretNumber(int[]sequence,int secretNumber){

        int start =0;
        int end = sequence.length-1;
        while (start<=end){
            int middle = (start +end)/2;

            if(sequence[middle]== secretNumber){
                return middle;
            } else if (sequence[middle]<secretNumber) {
                start = middle+1;
            }else{
                end = middle -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] sequence = {11, 15, 17, 21, 34, 45, 56, 78, 89, 99}; // Example sequence of numbers
        int secretNumber = 45; // Example secret number

        int result = findSecretNumber(sequence, secretNumber);

        if (result == -1) {
            System.out.println("Secret number not found in the sequence.");
        } else {
            System.out.println("Secret number found at index: " + result);
        }
    }
}
