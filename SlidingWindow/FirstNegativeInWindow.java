package SlidingWindow;

public class FirstNegativeInWindow {
    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = {-8, 2, 3, -6, 10};
        int k1 = 2;
        System.out.println("Test case 1 Output: ");
        printFirstNegatives(arr1, k1);

        // Test case 2
        int[] arr2 = {12, -1, -7, 8, -15, 30, 16, 28};
        int k2 = 3;
        System.out.println("Test case 2 Output: ");
        printFirstNegatives(arr2, k2);
    }

    private static void printFirstNegatives(int[] arr, int k) {
        for(int i=0;i<arr.length-k+1;i++){
            boolean negetive = false;
            for(int j =0;j<k;j++){
                if(arr[i+j]<0){
                    negetive=true;
                    System.out.println(arr[i+j]+ " ");
                    break;
                }
            }
            if(!negetive){
                System.out.println("0");
            }
        }
    }
}
