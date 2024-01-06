package Arrays.Binary_Search_Str1;



public class Bin_search_Str_1 {
        public static int findStringIndex(String[] words,String targetWord){
            int left =0;
            int right = words.length-1;
            while(left<=right){
                int mid = (left+right)/2;
                int result = targetWord.compareTo(words[mid]);

                if(result == 0){
                    return mid;
                }
                else if(result<0){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
            return -1;
        }


        public static void main (String[]args){
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

