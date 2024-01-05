package Arrays.Linear_Search_Strings;

public class Arrays1_Lin_Search_Str {

    public static int findStringIndex(String []words, String targetWord){
        //take the lenght of the string array
        int len = words.length;
        int i;

        for(i=0;i<=len-1;i++){
            if(words[i].equals(targetWord)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "date", "elderberry"}; // Example array of words
        String targetWord = "cherry"; // Target word to find

        int result = findStringIndex(words, targetWord);

        if (result == -1) {
            System.out.println("Word not found in the array.");
        } else {
            System.out.println("Word found at index: " + result);
        }
    }
}
