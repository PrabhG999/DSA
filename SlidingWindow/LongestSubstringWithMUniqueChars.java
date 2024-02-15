package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithMUniqueChars {
    public static void main(String[] args) {
        String str1 = "aabbcc";
        int k1 = 1;
        System.out.println("Output for k = 1: " + longestSubstringWithMUniqueChars(str1, k1)); // Output: 2

        String str2 = "aabbcc";
        int k2 = 2;
        System.out.println("Output for k = 2: " + longestSubstringWithMUniqueChars(str2, k2)); // Output: 4
    }

    private static int longestSubstringWithMUniqueChars(String str, int k) {
        int subStrlen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {

                for (int x = i; x < j; x++) {
                    map.put(str.charAt(x), map.getOrDefault(str.charAt(x),0)+1);
                    System.out.println(map);
                }
                if (map.size() == k) {
                    subStrlen = Math.max(subStrlen, j - i);
                }
            }
        }
        return subStrlen;
    }
}
