package Arrays.Linear_Search_int;

public class Array_1_Lin_Search {

    public static int linearSearch(int []array,int target){
        int len = array.length; //take the length og the array

        for(int i =0;i<=len-1;i++){
            if(array[i] == target){
                return i;
            }
        }
        //if value dont exit then return -1
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2}; // Example array
        int target = 4; // Target number to find

        int result = linearSearch(array, target); //declaring a method with parameters

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
