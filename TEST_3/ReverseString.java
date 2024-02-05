package TEST_3;

public class ReverseString {
    public static void main(String[]args){
        String str = "hello";
        //reverse string
       String result= reverseString(str);
        System.out.println(result);
    }

    private static String reverseString(String str) {
        char [] arr = str.toCharArray();

        int j = arr.length-1;
        for(int i=0;i< arr.length;i++){
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
            j--;
        }
        return String.valueOf(arr);
    }
}
