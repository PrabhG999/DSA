package Arrays.Two_pointer;

public class Two_pointer_sort {
    //will be using 2 pointer to sort the element

    public static void main(String[] args) {
        // Define an unsorted array of integers
        int[] unsortedArray = {1, 1, 2, 2, 3, 3, 4, 5, 5};
        int length = removeDuplicates(unsortedArray);

        System.out.println("Array after removing duplicates:");
        for (int k = 0; k < length; k++) {
            System.out.print(unsortedArray[k] + " ");
        }
    }
    public static int removeDuplicates(int []unsortedArray){
        //two pointer to remove duplicates in O(n)
        if(unsortedArray.length==0){
            return 0;
        }
        int i =0;
        for(int j =1;j< unsortedArray.length;j++){
            if(unsortedArray[i]!=unsortedArray[j]){
                i++;
                unsortedArray[i]=unsortedArray[j];
            }
        }
        return i+1;
    }
}
