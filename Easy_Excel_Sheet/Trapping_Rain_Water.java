package Easy_Excel_Sheet;

import java.util.*;

public class Trapping_Rain_Water {
    public static void main(String[] args) {
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] height2 = {4, 2, 0, 3, 2, 5};

        System.out.println("Example 1:");
        System.out.println("Input: height = " + Arrays.toString(height1));
        int trappedWater1 = trap(height1);
        System.out.println("Output: " + trappedWater1);
        System.out.println();

        System.out.println("Example 2:");
        System.out.println("Input: height = " + Arrays.toString(height2));
        int trappedWater2 = trap(height2);
        System.out.println("Output: " + trappedWater2);
    }

    private static int trap(int[] height) {
        int result =0;
        int length = height.length;

        for(int i=1;i<length-1;i++){
            int lp= height[i];
            for(int j=0;j<i;j++){

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
        return result;
    }
}
