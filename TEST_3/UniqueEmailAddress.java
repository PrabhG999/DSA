package TEST_3;
import java.util.*;
public class UniqueEmailAddress {
    public static void main(String[] args) {
        String[] emails1 = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        System.out.println("Example 1:");
        System.out.println("Input: " + Arrays.toString(emails1));
        System.out.println("Output: " + numUniqueEmails(emails1));

        String[] emails2 = {"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"};
        System.out.println("\nExample 2:");
        System.out.println("Input: " + Arrays.toString(emails2));
        System.out.println("Output: " + numUniqueEmails(emails2));
    }

    private static int numUniqueEmails(String[] emails) {
        Map<String, Integer> hm = new HashMap<>();

        for(String email: emails) {
            StringBuilder user = new StringBuilder();

            String[] splits = email.split("@");
            for(int i = 0; i < splits[0].length(); i++) {
                char c = splits[0].charAt(i);
                if(c == '+') break;
                if(c == '.') continue;
                user.append(c);
            }

            user.append("@" + splits[1]);
            hm.put(user.toString(), hm.getOrDefault(user.toString(), 0) + 1);
        }

        return hm.size();
    }
}
