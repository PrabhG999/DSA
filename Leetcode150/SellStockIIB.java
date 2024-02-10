package Leetcode150;

public class SellStockIIB {
    public static void main(String[] args) {
        // Example 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Example 1 Output: " + maxProfit(prices1)); // Output: 7

        // Example 2
        int[] prices2 = {1, 2, 3, 4, 5};
        System.out.println("Example 2 Output: " + maxProfit(prices2)); // Output: 4

        // Example 3
        int[] prices3 = {7, 6, 4, 3, 1};
        System.out.println("Example 3 Output: " + maxProfit(prices3)); // Output: 0
    }

    public static int maxProfit(int[] prices) {
        // Your implementation here
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;// Placeholder return value
    }
}
