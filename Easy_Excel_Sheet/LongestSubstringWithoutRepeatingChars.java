package Easy_Excel_Sheet;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        // Test cases
        String s1 = "abcabcbb";
        System.out.println("Example 1:");
        System.out.println("Input: s = \"" + s1 + "\"");
        int length1 = lengthOfLongestSubstring(s1);
        System.out.println("Output: " + length1);
        System.out.println();

        String s2 = "bbbbb";
        System.out.println("Example 2:");
        System.out.println("Input: s = \"" + s2 + "\"");
        int length2 = lengthOfLongestSubstring(s2);
        System.out.println("Output: " + length2);
        System.out.println();

        String s3 = "pwwkew";
        System.out.println("Example 3:");
        System.out.println("Input: s = \"" + s3 + "\"");
        int length3 = lengthOfLongestSubstring(s3);
        System.out.println("Output: " + length3);
    }

    public static int lengthOfLongestSubstring(String s) {
            int start =0,end =0;
            HashMap<Character,Integer>map = new HashMap<>();
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                start= Math.max(start, map.getOrDefault(c,-1)+1);
                map.put(c,i);
                end = Math.max(end, i-start+1);
            }
        return end;
    }
}
