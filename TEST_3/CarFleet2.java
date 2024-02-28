package TEST_3;

public class CarFleet2 {
    public static void main(String[] args) {
        // Example 1
        int[] position1 = {10, 8, 0, 5, 3};
        int[] speed1 = {2, 4, 1, 1, 3};
        int target1 = 12;
        System.out.println("Example 1 Output: " + carFleet(target1, position1, speed1)); // Output: 3

        // Example 2
        int[] position2 = {3};
        int[] speed2 = {3};
        int target2 = 10;
        System.out.println("Example 2 Output: " + carFleet(target2, position2, speed2)); // Output: 1

        // Example 3
        int[] position3 = {0, 2, 4};
        int[] speed3 = {4, 2, 1};
        int target3 = 100;
        System.out.println("Example 3 Output: " + carFleet(target3, position3, speed3)); // Output: 1
    }

    private static int carFleet(int target, int[] position, int[] speed) {
        int ans = 0;
        int time[] = new int[target];
        for (int i = 0; i < position.length; i++) {
            time[position[i]] = (target - position[i]) / speed[i];
        }
        int previos = 0;
        for (int j = target - 1; j >= 0; j--) {
            if (time[j] > previos) {
                previos=time[j];
                ans++;
            }
        }
        return ans;
    }
}
