package Leetcode150;

public class Container_With_Most_Water {
    public static void main(String[] args) {
        // Test case 1
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Test case 1 Output: " + maxArea(height1)); // Output: 49

        // Test case 2
        int[] height2 = {1, 1};
        System.out.println("Test case 2 Output: " + maxArea(height2)); // Output: 1
    }

    private static int maxArea(int[] height) {
        int max_Area =0;
        int start =0;
        int end = height.length-1;
        while(start<end){
            if(height[start]<height[end]){
                max_Area = Math.max(max_Area,height[start]*(end-start));
                start+=1;
            }else{
                max_Area = Math.max(max_Area,height[end]*(end-start));
                end-=1;
            }
        }

        return max_Area;
    }
}
