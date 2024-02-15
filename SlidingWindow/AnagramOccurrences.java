package SlidingWindow;

import java.util.Arrays;

public class AnagramOccurrences {
    public static void main(String[] args) {
        // Test case 1
        String text1 = "forxxorfxdofr";
        String word1 = "for";
        int count1 = countAnagramOccurrences(text1, word1);
        System.out.println("Test case 1 Output: " + count1); // Should output 3

        // Test case 2
        String text2 = "aabaabaa";
        String word2 = "aaba";
        int count2 = countAnagramOccurrences(text2, word2);
        System.out.println("Test case 2 Output: " + count2); // Should output 4
    }

    private static int countAnagramOccurrences(String text, String word) {
        int count = 0;
        //length of windows in text
        int windowLen = text.length() - word.length() + 1;
        for (int i = 0; i < windowLen; i++) {
            String str = text.substring(i, i + word.length());
            if (isAnagram(str, word)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isAnagram(String str, String word) {
        if (str.length() != word.length()) {
            return false;
        }
        //alternate way
        char[] strArray = str.toCharArray();
        char[] wordArray = word.toCharArray();
        Arrays.sort(strArray);
        Arrays.sort(wordArray);
        return Arrays.equals(strArray, wordArray);

       /* int count[] = new int[256];
        char st[] = str.toCharArray();
        char w[] = word.toCharArray();
        for (char ch : st) {
            count[ch]++;
        }
        for (char ch : w) {
            count[ch]--;
        }
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;*/
    }

}
