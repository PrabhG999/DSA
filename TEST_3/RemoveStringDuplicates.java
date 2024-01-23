package TEST_3;
import java.util.Arrays;

public class RemoveStringDuplicates {
    public static String removeDuplicates(String str) {
        // Your code to remove duplicates goes here
        if(str==null || str.length()<=1){
            return str;
        }
        char[] result = str.toCharArray();   //saved the string into an array
        int i=0;
        for(int j =1;j<str.length();j++){
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
    }
}
