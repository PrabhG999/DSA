package Arrays.Two_pointer;

public class Two_Pointer_1 {
    public static boolean isPalindrome(String example){

        //regex check to remove spaces and spaceial chars
        String clean = example.replaceAll("[^a-zA-Z]","").toLowerCase();   //this regex check only keeps letters and .toLowerCase turns them to lowerCase
        System.out.println("The new string post regex check"+ "- "+ clean);
        //implementing TWO _ POINTER ALGORITHM
        int left =0;
        int right = clean.length()-1;

        while(left<=right){

            if(clean.charAt(left)!=clean.charAt(right)){
                return false;
            }
            left ++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String example = "A man, a plan, a canal, Panama";
        boolean result = isPalindrome(example);

        if (result) {
            System.out.println("'" + example + "' is a palindrome.");
        } else {
            System.out.println("'" + example + "' is not a palindrome.");
        }
    }
}
