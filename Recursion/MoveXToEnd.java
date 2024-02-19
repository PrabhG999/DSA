package Recursion;

public class MoveXToEnd {
    public static void main(String[] args) {
        String input = "xbox xerox x-ray xylophone"; // Example input string
        String sortedInput = input.replaceAll("[^a-z]","");
        String result = moveXToEnd(sortedInput,"",0,0);
        System.out.println("Original string: " + input);
        System.out.println("String with 'x' moved to end: " + result);
    }


    private static String moveXToEnd(String input,String result,int index , int count) {
        if(index==input.length()-1){
            for(int i=0;i<count;i++){
                result+='x';
            }
            return result;
        }
        char currChar = input.charAt(index);
        if(currChar=='x'){
            count++;
        }else{
            result+=currChar;
        }
        return moveXToEnd(input,result,index+1,count);
    }
}
