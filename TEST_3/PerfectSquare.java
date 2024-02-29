package TEST_3;

public class PerfectSquare {
    public static void main(String[] args) {

        int[] testCases = {16, 14, 25, 30};

        for (int num : testCases) {
            System.out.println("Input: num = " + num);
            System.out.println("Output: " + isPerfectSquare(num));
            System.out.println();
        }
    }

    private static boolean isPerfectSquare(int num) {
        int start =1;
        int end = num;
        while(start<=end){
            int mid = start + (end-start)/2;
            int square = mid*mid;
            if(square == num){
                return true;
            }else if (square < num){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
}
