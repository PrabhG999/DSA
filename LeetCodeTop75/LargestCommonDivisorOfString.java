package LeetCodeTop75;

public class LargestCommonDivisorOfString {
    public static void main(String[] args) {
        // Test cases
        String str1 = "ABCABC";
        String str2 = "ABC";
        String result1 = gcdOfStrings(str1, str2);
        System.out.println("Test 1: " + result1); // Expected output: "ABC"

        String str3 = "ABABAB";
        String str4 = "ABAB";
        String result2 = gcdOfStrings(str3, str4);
        System.out.println("Test 2: " + result2); // Expected output: "AB"

        String str5 = "LEET";
        String str6 = "CODE";
        String result3 = gcdOfStrings(str5, str6);
        System.out.println("Test 3: " + result3); // Expected output: ""
    }

    private static String gcdOfStrings(String str1, String str2) {

        if(!(str1+str2).equals(str2+str1)){
            return " ";
        }
        return str1.substring(0,gcdCal(str1.length(),str2.length()));
    }

    private static int gcdCal(int a, int b) {
        while(b>0){
            int temp =  b;
             b= a%b;
            a=temp;
        }
        return a;
    }

}
