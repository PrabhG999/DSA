package Arrays.Two_pointer;

import java.util.Arrays;

public class ValidPalindrome {
    public static void main(String[] args) {
        // Example 1
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Example 1 Output: " + isPalindrome(s1)); // Output: true

        // Example 2
        String s2 = "race a car";
        System.out.println("Example 2 Output: " + isPalindrome(s2)); // Output: false

        // Example 3
        String s3 = " ";
        System.out.println("Example 3 Output: " + isPalindrome(s3)); // Output: true
    }

    public static boolean isPalindrome(String s) {

        char sorted[] = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        System.out.println(Arrays.toString(sorted));
        if (sorted.length == 0) {
            return true;
        }
        int left = 0;
        int right = sorted.length - 1;
        while (left < right) {
            if (sorted[left] != sorted[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
