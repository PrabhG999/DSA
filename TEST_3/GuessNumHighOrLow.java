package TEST_3;

public class GuessNumHighOrLow {
    public static void main(String[] args) {
        int n1 = 10;
        int pick1 = 6;
        int result1 = guessNumber(n1, pick1);
        System.out.println("Example 1: " + result1); // Output: 6

        int n2 = 1;
        int pick2 = 1;
        int result2 = guessNumber(n2, pick2);
        System.out.println("Example 2: " + result2); // Output: 1

        int n3 = 2;
        int pick3 = 1;
        int result3 = guessNumber(n3, pick3);
        System.out.println("Example 3: " + result3); // Output: 1
    }

    private static int guessNumber(int n, int pick) {
        int left =1;
        int right = n;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(guess(mid)==0){
                return mid;
            }else if(guess(mid)==1){
                left= mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
    private static int guess(int num) {
        int pick = 6; // You need to replace this with the actual value of 'pick'
        if (num < pick) {
            return 1;
        } else if (num > pick) {
            return -1;
        } else {
            return 0;
        }
    }
}
