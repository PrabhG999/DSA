package TEST_3;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Test cases for removeDuplicates
        System.out.println(removeDuplicates(new int[]{1, 1, 2})); // Should return 2
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4})); // Should return 5
    }

    private static int removeDuplicates(int[] ints) {
        int lenght = ints.length;
        int i=0;
        for(int j=1;j<lenght-1;j++){
            if(ints[i]!=ints[j]){
                i++;
                ints[i]=ints[j];
            }
        }
        return i +1;
    }
}
