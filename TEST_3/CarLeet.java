package TEST_3;

public class CarLeet {
    public static void main(String[] args) {
        int target1 = 12;
        int[] position1 = {10, 8, 0, 5, 3};
        int[] speed1 = {2, 4, 1, 1, 3};

        int target2 = 10;
        int[] position2 = {3};
        int[] speed2 = {3};

        int target3 = 100;
        int[] position3 = {0, 2, 4};
        int[] speed3 = {4, 2, 1};

        System.out.println("Example 1 Output: " + carFleet(target1, position1, speed1));
        System.out.println("Example 2 Output: " + carFleet(target2, position2, speed2));
        System.out.println("Example 3 Output: " + carFleet(target3, position3, speed3));
    }

    private static int carFleet(int target, int[] position, int[] speed) {
        int posLen = position.length;
        int speedlen = speed.length;
        int count =0;
        if(posLen!=speedlen){
            return -1;
        }
        for(int i=0;i<posLen;i++){
            for(int j=0;j<speedlen;j++){
                int sum = position[i]+speed[j];
                if (sum==target){
                    count++;
                }
            }
        }


        return count;
    }
}
