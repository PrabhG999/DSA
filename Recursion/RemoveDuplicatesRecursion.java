package Recursion;

public class RemoveDuplicatesRecursion {
    public static void main(String[] args) {
        String input = "hello world"; // Example input string
        String result = removeDuplicates(input, "", 0);
        System.out.println("Original string: " + input);
        System.out.println("String with duplicates removed: " + result);
    }

    private static String removeDuplicates(String input, String result, int index) {
        if (index == input.length()) {
            return result;
        }
        char currChar = input.charAt(index);
        if (currChar >= 'a' && currChar <= 'z') {
            if (!result.contains(String.valueOf(currChar))) {
                result += currChar;
            }
        } else {
            result += currChar;
        }

       return removeDuplicates(input,result,index+1);
    }
}
