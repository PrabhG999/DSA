package Recursion;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello, world!";
        System.out.println("Original string: " + str);
        System.out.print("Reversed string: ");
        String clean  = str.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();
        printReverse(clean,clean.length()-1);
        System.out.println();
    }

    private static void printReverse(String str, int i) {
        if(i==0){
            System.out.println(str.charAt(i));
            return;
        }else {
            System.out.print(str.charAt(i));
            printReverse(str, i - 1);
        }
    }
}
