package TEST_3;

public class StockPriceSearch {

    public static void main(String[] args) {
        // Test cases for findTimeWhenStockExceeds
        System.out.println(findTimeWhenStockExceeds(new int[]{100, 98, 102, 105, 103}, 101)); // Should return 2
        System.out.println(findTimeWhenStockExceeds(new int[]{1, 118, 117, 121, 123}, 119)); // Should return 3
        System.out.println(findTimeWhenStockExceeds(new int[]{130, 132, 128, 127, 129}, 131)); // Should return 1
        System.out.println(findTimeWhenStockExceeds(new int[]{95, 94, 96, 97, 99}, 100)); // Should return -1
    }

    // Method to implement
    public static int findTimeWhenStockExceeds(int[] stockPrices, int targetPrice) {
        // TODO: Implement the logic to find the first time the stock price exceeds the target price
        for (int i =0;i<stockPrices.length;i++){
            if(stockPrices[i]>= targetPrice){
                return i;
            }
        }
        return -1; // Placeholder return statement
    }
}

