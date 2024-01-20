package TEST_3;

public class TemperatureRangeSearch {

    public static void main(String[] args) {
        // Test cases for findTemperatureInRange
        System.out.println(findTemperatureInRange(new int[]{23, 20, 21, 19, 24, 25, 22}, 18, 20)); // Should return 1
        System.out.println(findTemperatureInRange(new int[]{30, 28, 32, 31, 29, 27, 33}, 30, 35)); // Should return 0
        System.out.println(findTemperatureInRange(new int[]{16, 17, 18, 19, 20, 21, 22, 23, 24, 25}, 21, 23)); // Should return 5
        System.out.println(findTemperatureInRange(new int[]{10, 12, 14, 16, 18, 20}, 15, 17)); // Should return 3
    }

    // Method to implement
    public static int findTemperatureInRange(int[] temperatures, int lowerBound, int upperBound) {
        // TODO: Implement the linear search algorithm to find the first temperature within the range
        for(int i =0;i<temperatures.length;i++){
            if(temperatures[i]>=lowerBound && temperatures[i]<=upperBound){
                return i;
            }
        }
        return -1; // Placeholder return statement
    }
}
