package LeetCodeTop75;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        // Test cases
        String word1 = "abc";
        String word2 = "pqr";
        String result1 = mergeAlternately(word1, word2);
        System.out.println("Test 1: " + result1); // Expected output: "apbqcr"

        String word3 = "ab";
        String word4 = "pqrs";
        String result2 = mergeAlternately(word3, word4);
        System.out.println("Test 2: " + result2); // Expected output: "apbqrs"

        String word5 = "abcd";
        String word6 = "pq";
        String result3 = mergeAlternately(word5, word6);
        System.out.println("Test 3: " + result3); // Expected output: "apbqcd"
    }

    static String mergeAlternately(String a, String b) {
        if (a == null || a.length() <= 1 && b == null || b.length() <= 1) {

            return " ";
        }
        StringBuilder result = new StringBuilder();
        int maxlen = Math.max(a.length(), b.length());

        for (int i = 0; i < maxlen; i++) {
            if (i < a.length()) {
                result.append(a.charAt(i));
            }
            if (i < b.length()) {
                result.append(b.charAt(i));
            }

        }
        return result.toString();

    }

}

