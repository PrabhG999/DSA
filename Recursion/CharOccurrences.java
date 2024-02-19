package Recursion;

public class CharOccurrences {
    public static int first =-1;
    public static int Second =-1;
    public static void main(String[] args) {
        String str = "Hello, world!";
        char ch = 'o';
        String clean = str.replaceAll("[^a-zA-Z]","").toLowerCase();
// \\s is for white spaces
      findOccurrence(clean, ch,0);

        System.out.println("String: " + clean);
        System.out.println("Character to find: " + ch);
        System.out.println(first);
        System.out.println(Second);

    }

    private static void findOccurrence(String str, char ch, int i) {
        if (i >= str.length() || (first != -1 && Second != -1)) {
            return; // Stop recursion if index exceeds length or both occurrences found
        }
        char currChar = str.charAt(i);
        if(currChar==ch){
            if(first==-1){
                first=i;
            }else{
                Second=i;
            }
        }
        findOccurrence(str,ch,i+1);
    }
}
