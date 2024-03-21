package Easy_Excel_Sheet;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars2 {
    public static void main(String[] args) {
        // Test cases
        String s1 = "abcabcbb";
        System.out.println("Example 1:");
        System.out.println("Input: s = \"" + s1 + "\"");
        int length1 = lengthOfLongestSubstring2(s1);
        System.out.println("Output: " + length1);
        System.out.println();

        String s2 = "bbbbb";
        System.out.println("Example 2:");
        System.out.println("Input: s = \"" + s2 + "\"");
        int length2 = lengthOfLongestSubstring2(s2);
        System.out.println("Output: " + length2);
        System.out.println();

        String s3 = "pwwkew";
        System.out.println("Example 3:");
        System.out.println("Input: s = \"" + s3 + "\"");
        int length3 = lengthOfLongestSubstring2(s3);
        System.out.println("Output: " + length3);
    }

    private static int lengthOfLongestSubstring2(String s) {
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        int i = 0, j = 0;
        while (i < s.length() && j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                maxLen = Math.max(maxLen, j - i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxLen;
    }
}
