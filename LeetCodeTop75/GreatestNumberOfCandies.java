package LeetCodeTop75;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {
    public static void main(String[] args) {
        // Test cases
        int[] candies1 = {2, 3, 5, 1, 3};
        int extraCandies1 = 3;
        List<Boolean> result1 = kidsWithCandies(candies1, extraCandies1);
        System.out.println("Test 1: " + result1); // Expected output: [true, true, true, false, true]

        int[] candies2 = {4, 2, 1, 1, 2};
        int extraCandies2 = 1;
        List<Boolean> result2 = kidsWithCandies(candies2, extraCandies2);
        System.out.println("Test 2: " + result2); // Expected output: [true, false, false, false, false]

        int[] candies3 = {12, 1, 12};
        int extraCandies3 = 10;
        List<Boolean> result3 = kidsWithCandies(candies3, extraCandies3);
        System.out.println("Test 3: " + result3); // Expected output: [true, false, true]
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandy) {
        int max = calMax(candies);

        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            int sum = (candies[i] + extraCandy);
            if (sum >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    private static int calMax(int[] candies) {
        int max = candies[0];
       for(int i=0;i<candies.length;i++){
           if(candies[i]>max){
               max = candies[i];
           }
       }
        return max;
    }
}
