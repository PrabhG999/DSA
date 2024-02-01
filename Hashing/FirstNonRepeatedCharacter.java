package Hashing;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String input = "javaj"; // You can change this to test with different strings
        HashMap<Character, Integer> map = new HashMap<>();

        // Your code goes here to fill in the frequencyMap

        // Find and print the first non-repeated character
        // Your code goes here
        for(char c:input.toCharArray()){
            //add element to the array
            map.put(c, map.getOrDefault(c,0)+1);
        }
        char result = '\0';
        for(char c : map.keySet()){
            if(map.get(c)==1){
                result = c;
                break;
            }
        }
        System.out.println(" the non repeated value is "+ result);

    }
}
