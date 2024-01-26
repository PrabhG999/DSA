package Arrays.Greedy;

public class GreedyChange {
    public static void main(String[] args) {
        int[] coinValues = {25, 10, 5, 1}; // Coin denominations in descending order

        int amount = 63; // Amount for which we want to make change

        int numCoins = 0; // Initialize the number of coins used to zero

        for (int i = 0; i < coinValues.length; i++) {
            int coinValue = coinValues[i];

            while (amount >= coinValue) {
                // Use the largest coin denomination as long as possible
                amount -= coinValue;
                numCoins++;
            }
        }

        System.out.println("Minimum number of coins needed: " + numCoins);
    }
}

