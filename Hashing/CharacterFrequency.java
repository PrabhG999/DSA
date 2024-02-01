package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

    public static void main(String[] args) {
        String input = "hello"; // You can change this to test with different strings
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Your code goes here to fill in the frequencyMap
        for(char c : input.toCharArray()){ //set the string in an array
            if(frequencyMap.containsKey(c)){
                frequencyMap.put(c,frequencyMap.get(c)+1);
            }else{
                frequencyMap.put(c,1);
            }
        }

        // Printing the character frequencies
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
