package Arrays.Insertion_sort;

import java.util.Arrays;

public class insertion_sort_2 {
    public static int removeDupes(int[] array, int size) {
        if(size==0){
            return 0;
        }
        //to remove duplicates
        int i = 0;
        int j; //i is 22 and j is 22 (1st index)
        //using a twoPointer approach
        for(j =1;j<size;j++){
            if(array[i]!=array[j]){
                i++;
                array[i]=array[j];
            }
        }
        return i + 1;
    }
    public static void insertionSort_2(int []array,int size){

        //sorting the array using insertion sort

        for(int i=1;i<size;i++){
           int  key = array[i];
           int j= i-1; //o index to start from I is ahead of j

            while(j>=0 && array[j]>key){
                array[j+1]=j;
                j--;
            }
             array[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int[] array = {22, 22, 18, 30, 5, 11, 11, 27, 16, 2, 2, 2, 2, 9, 14};

        System.out.println("Original Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }

        int newSize = removeDupes(array, array.length);
        System.out.println("\nArray after removing duplicates:");
        for (int k = 0; k < newSize; k++) {
            System.out.print(array[k] + " ");
        }

        insertionSort_2(array, newSize);

        System.out.println("\nSorted Array:");
        for (int k = 0; k < newSize; k++) {
            System.out.print(array[k] + " ");
        }
    }
}
