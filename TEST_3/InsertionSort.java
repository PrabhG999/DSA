package TEST_3;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int len = arr.length;
        for(int i=1;i<len;i++){
            int key = arr[i];
            int j= i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int[] arrayToSort1 = {5, 2, 9, 1, 5, 6};
        int[] arrayToSort2 = {12, 8, 4, 6, 10, 2};
        int[] arrayToSort3 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        System.out.println("Original Array 1: " + Arrays.toString(arrayToSort1));
        insertionSort(arrayToSort1);
        System.out.println("Sorted Array 1: " + Arrays.toString(arrayToSort1));

        System.out.println("Original Array 2: " + Arrays.toString(arrayToSort2));
        insertionSort(arrayToSort2);
        System.out.println("Sorted Array 2: " + Arrays.toString(arrayToSort2));

        System.out.println("Original Array 3: " + Arrays.toString(arrayToSort3));
        insertionSort(arrayToSort3);
        System.out.println("Sorted Array 3: " + Arrays.toString(arrayToSort3));
    }
}

