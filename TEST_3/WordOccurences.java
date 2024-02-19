package TEST_3;

public class WordOccurences {
    public static void main(String[] args) {
        // Test cases
        String string1 = "GeeksforGeeks A computer science portal for geeks";
        String word1 = "portal";
        System.out.println("Input string: " + string1);
        System.out.println("Word to search: " + word1);
        System.out.println("Occurrences of Word: " + countOccurrences(string1, word1) + " Time");

        String string2 = "GeeksforGeeks A computer science portal for geeks";
        String word2 = "technical";
        System.out.println("\nInput string: " + string2);
        System.out.println("Word to search: " + word2);
        System.out.println("Occurrences of Word: " + countOccurrences(string2, word2) + " Time");
    }

    private static int countOccurrences(String string, String word) {
        String words[] = string.split(" ");
        int count = 0;
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }

        return count;
    }
}
