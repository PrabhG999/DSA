package TEST_3;

public class TemperatureSearch {

    public static void main(String[] args) {
        // Test cases for findTemperature
        System.out.println(findTemperature(new int[]{23, 20, 21, 19, 24, 25, 22}, 19)); // Should return 3
        System.out.println(findTemperature(new int[]{30, 28, 32, 31, 29, 27, 33}, 33)); // Should return 6
        System.out.println(findTemperature(new int[]{16, 17, 18, 19, 20, 21, 22, 23, 24, 25}, 22)); // Should return 6
        System.out.println(findTemperature(new int[]{10, 12, 14, 16, 18, 20}, 15)); // Should return -1
    }

    // Method to implement
    public static int findTemperature(int[] temperatures, int targetTemp) {
        // TODO: Implement the linear search algorithm here
        for(int i =0;i<temperatures.length;i++){
            if(temperatures[i]==targetTemp){
                return i;
            }
        }
        return -1; // Placeholder return statement

    }
}

