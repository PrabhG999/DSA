package Leetcode150;

public class BuySellStock {
    public static void main(String[] args) {
        // Example 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Example 1 Output: " + maxProfit(prices1)); // Output: 5

        // Example 2
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Example 2 Output: " + maxProfit(prices2)); // Output: 0
    }

    public static int maxProfit(int[] prices) {
        // Your implementation here
        int buy =0;
        int sell =1;
        int profit =0;
        for(int i=1;i<prices.length;i++){
            if(prices[buy]<prices[sell]){
                profit = Math.max(profit,prices[sell++]-prices[buy]);
            }else{
                buy=sell;
                sell++;
            }

        }

        return profit; // Placeholder return value
    }
}
