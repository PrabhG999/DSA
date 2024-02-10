package Leetcode150;

public class SellStockII {
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
        int profit =0;
        int buy =0;
        int sell =1;
        while(sell<prices.length){
            if(prices[buy]<prices[sell]){
                profit += prices[sell] - prices[buy];
            }
            sell++;
            buy++;
        }
        return profit; // Placeholder return value
    }
}
