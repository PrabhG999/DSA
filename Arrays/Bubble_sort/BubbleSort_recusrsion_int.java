package Arrays.Bubble_sort;

import java.util.Arrays;

public class BubbleSort_recusrsion_int {
    public static void bubbleSort2(int[] arr, int length) {
        System.out.println("unsorted Array in every step"+ Arrays.toString(arr));
        if (length <= 1) {
            return;
        }
        int temp;
        for (int i = 0; i < length - 1; i++) {         //bubble sort if element a > b ! then swap them using temp
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubbleSort2(arr, length - 1);
        //calling bubble sort for the whole array
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("The array we need to sort" + Arrays.toString(arr));
        bubbleSort2(arr, arr.length);


        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); //giving space
        }
    }
}
