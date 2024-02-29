package TEST_3;
import java.util.*;
public class FairCandy {
    public static void main(String[] args) {
        int[] aliceSizes1 = {1, 1};
        int[] bobSizes1 = {2, 2};
        int[] result1 = fairCandySwap(aliceSizes1, bobSizes1);
        System.out.println("Example 1: " + Arrays.toString(result1)); // Output: [1, 2]

        int[] aliceSizes2 = {1, 2};
        int[] bobSizes2 = {2, 3};
        int[] result2 = fairCandySwap(aliceSizes2, bobSizes2);
        System.out.println("Example 2: " + Arrays.toString(result2)); // Output: [1, 2]

        int[] aliceSizes3 = {2};
        int[] bobSizes3 = {1, 3};
        int[] result3 = fairCandySwap(aliceSizes3, bobSizes3);
        System.out.println("Example 3: " + Arrays.toString(result3)); // Output: [2, 3]
    }

    private static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = Arrays.stream(aliceSizes).sum();
        int bobSum = Arrays.stream(bobSizes).sum();
        int diff = (aliceSum-bobSum)/2;
        for(int a :aliceSizes){
            for (int b:bobSizes){
                if(a-b==diff){
                    return new int[]{a,b};
                }
            }
        }
        return new int[2];
    }
}
