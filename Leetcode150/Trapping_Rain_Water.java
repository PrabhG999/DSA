package Leetcode150;

public class Trapping_Rain_Water {
    public static void main(String[] args) {
        // Test case 1
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int trappedWater1 = trap(height1);
        System.out.println("Test case 1 Output: " + trappedWater1); // Expected output: 6

        // Test case 2
        int[] height2 = {4, 2, 0, 3, 2, 5};
        int trappedWater2 = trap(height2);
        System.out.println("Test case 2 Output: " + trappedWater2); // Expected output: 9
    }

    public static int trap(int[] height) {
       int result =0;
       int length = height.length;

        for(int i=1;i<length-1;i++){
            int lp= height[i];
            for(int j=0;j<i;j++){
                /*lp= Math.max(lp,height[j]);*/
                if(height[j]>lp){
                    lp = height[j];
                }
            }
            int rp =0;
            for(int x =i+1;x<length;x++){
                rp = Math.max(rp,height[x]);
            }
            int water_level =Math.min(rp,lp);
            int trapped_water = Math.max(0,water_level-height[i]);
            result+= trapped_water;
        }
        return result; // Placeholder return value
    }

}
