package TEST_3;public class POWEROFFOUR {
    public static void main(String[] args) {
        int[] testCases = {16, 5, 1};

        for (int n : testCases) {
            System.out.println(n + " is a power of four: " + isPowerOfFour(n));
        }
    }

    private static boolean isPowerOfFour(int n) {
        if(n<=1){
            return false;
        }
       while(n>1){
           if(n%4!=0){
               return false;
           }
           n/=4;
       }
        return true;
    }
}
