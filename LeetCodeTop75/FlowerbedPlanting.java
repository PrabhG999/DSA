package LeetCodeTop75;

public class FlowerbedPlanting {
    public static void main(String[] args) {
        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        boolean canPlant1 = canPlantFlowers(flowerbed1, n1);
        System.out.println("Example 1: " + canPlant1); // Expected output: true

        int[] flowerbed2 = {1,0,0,0,1,0,0};

        int n2 = 2;
        boolean canPlant2 = canPlantFlowers(flowerbed2, n2);
        System.out.println("Example 2: " + canPlant2); // Expected output: false
    }

    private static boolean canPlantFlowers(int[] flowerbed1, int n1) {
        int countFl= 0;
        int i=1;
        while(i<flowerbed1.length-1){
            if(flowerbed1[i]==0){
                if(i==0 || flowerbed1[i-1]==0 || flowerbed1[i+1]==0){
                    flowerbed1[i]=1;
                    countFl++;
                }
            }
            i++;
        }
        return countFl>=n1;
    }
}
