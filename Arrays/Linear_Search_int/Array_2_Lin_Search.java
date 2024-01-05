package Arrays.Linear_Search_int;

public class Array_2_Lin_Search {

    public static int findSecretNumber( int []sequence, int secretNumber){
        //length
        int len = sequence.length;

        for(int i =0;i<=len-1;i++){
            if(sequence[i]== secretNumber){
                return i;
            }
        }
        return -1; //as the target number inside the array dont exist
    }


    public static void main(String[] args) {
        int[] sequence = {21, 34, 15, 89, 56, 78, 17, 45, 99, 11}; // Example sequence of numbers
        int secretNumber = 45; // Example secret number

        int result = findSecretNumber(sequence, secretNumber);

        if (result == -1) {
            System.out.println("Secret number not found in the sequence.");
        } else {
            System.out.println("Secret number found at index: " + result);
        }
    }
}
