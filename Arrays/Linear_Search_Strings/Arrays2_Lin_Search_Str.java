package Arrays.Linear_Search_Strings;

public class Arrays2_Lin_Search_Str {

    public static int findCityIndex(String []cities,String targetCity){
        int len = cities.length;

        for(int i =0;i<=len-1;i++){
            if(cities[i].equals(targetCity)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] cities = {"New York", "Paris", "Berlin", "Tokyo", "Sydney"}; // Example array of cities
        String targetCity = "Tokyo"; // Destination city

        int result = findCityIndex(cities, targetCity);

        if (result == -1) {
            System.out.println("City not found in the array.");
        } else {
            System.out.println("City found at index: " + result);
        }
    }
}
