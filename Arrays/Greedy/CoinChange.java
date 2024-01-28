package Arrays.Greedy;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins1 = {1, 2, 5};
        int amount1 = 11;
        int result1 = minCoins(coins1, amount1);
        System.out.println("Minimum coins for amount " + amount1 + ": " + result1); // Expected output: 3

        int[] coins2 = {2};
        int amount2 = 3;
        int result2 = minCoins(coins2, amount2);
        System.out.println("Minimum coins for amount " + amount2 + ": " + result2); // Expected output: -1

        int[] coins3 = {1, 3, 4};
        int amount3 = 6;
        int result3 = minCoins(coins3, amount3);
        System.out.println("Minimum coins for amount " + amount3 + ": " + result3); // Expected output: 2
    }

    private static int minCoins(int[] coins1, int amount1) {

        //will do it with greedy but first we need to sort the array
        sorting(coins1);

        int numCoins = 0;
        for(int i=0;i<coins1.length;i++){
            int coinValue = coins1[i];

            while(amount1>=coinValue){
                amount1-=coinValue;
                numCoins+=1;
            }
        }
        return (amount1 == 0) ? numCoins : -1;
    }

    private static void sorting(int[] coins1) {
        for(int i=1;i<coins1.length;i++){
            int key =coins1[i];
            int j= i-1;
            while(j>=0 && coins1[j]>key){
                coins1[j+1]=coins1[j];
                j--;
            }
            coins1[j+1]=key;
        }
    }
}
