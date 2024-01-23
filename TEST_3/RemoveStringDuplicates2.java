package TEST_3;

import java.util.Arrays;

public class RemoveStringDuplicates2 {
    public static String removeDuplicates(String str) {
        // Your code to remove duplicates goes here
        //check is the lenght is null or less than 1
        if(str==null || str.length()<=1){
            return str;
        }
        //new array to store the string separately as array values
        char[] result = str.toCharArray();
        int i=0;
        for(int j=1;j<str.length();j++){
            if(result[i]!=result[j]){
                i++;
                result[i]=result[j];
            }
        }
        return new String(result,0,i+1);
    }

    public static void main(String[] args) {
        // Test cases
        String test1 = "hello";
        String result1 = removeDuplicates(test1);
        System.out.println("Test 1: " + result1); // Expected output: "helo"

        String test2 = "programming";
        String result2 = removeDuplicates(test2);
        System.out.println("Test 2: " + result2); // Expected output: "progamin"

        String test3 = "world";
        String result3 = removeDuplicates(test3);
        System.out.println("Test 3: " + result3); // Expected output: "world"

        String test4 = "aaaaabbbbbbccccc";
        String result4 = removeDuplicates(test4);
        System.out.println("Test 4: " + result4); // Expected output: "abc"

        String test5 = "";
        String result5 = removeDuplicates(test5);
        System.out.println("Test 5: " + result5); // Expected output: ""

        String test6 = "aabbcc";
        String result6 = removeDuplicates(test6);
        System.out.println("Test 6: " + result6); // Expected output: "abc"
    }
}
