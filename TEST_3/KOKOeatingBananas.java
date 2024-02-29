package TEST_3;

import java.util.Arrays;

public class KOKOeatingBananas {
    public static void main(String[] args) {
        int[] piles1 = {3, 6, 7, 11};
        int h1 = 8;
        System.out.println(minEatingSpeed(piles1, h1)); // Output: 4

        int[] piles2 = {30, 11, 23, 4, 20};
        int h2 = 5;
        System.out.println(minEatingSpeed(piles2, h2)); // Output: 30

        int[] piles3 = {30, 11, 23, 4, 20};
        int h3 = 6;
        System.out.println(minEatingSpeed(piles3, h3)); // Output: 23
    }

    private static int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = Arrays.stream(piles).max().orElse(0);

        int midSpeed = 0;
        while (minSpeed < maxSpeed) {
            midSpeed = minSpeed + (maxSpeed - minSpeed) / 2;
            if (canEatAll(piles, h, midSpeed)) {
                maxSpeed = midSpeed;
            } else {
                minSpeed = midSpeed + 1;
            }
        }
        return minSpeed;
    }

    private static boolean canEatAll(int[] piles, int h, int midSpeed) {
        int hours = 0;
        for(int pile:piles){
            hours+= (pile + midSpeed-1)/midSpeed;
        }
        return hours<=h;
    }

}
