package Arrays.Quick_sort;

public class Quick_sort_remove_dups {
    static void printArray_sorted(int[] arr, int length) {
        for (int i = 0; i < length; i++) {  //suplimental method to print the values of array.
            System.out.println(arr[i] + " ");
        }
    }

    static void printArray_unsorted(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l; i++) {  //suplimental method to print the values of array.
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int[] arr = {4, 1, 3, 4, 6, 2, 8, 5, 4, 7};
        System.out.println("Original Array:");
        printArray_unsorted(arr);

        quickSort(arr, 0, arr.length - 1);

        //first i will sort it and then remove duplicates , for sorting i will use quick sort. for removing duplicates i will use two pointer
        int newLenght = removeDups(arr, arr.length);

        System.out.println("Sorted Array:");
        printArray_sorted(arr, newLenght);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = postion(arr, low, high);  //to find position and compare with pivot

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high); //calling recursively *2 times
        }
    }

    private static int postion(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];                 //the swap method for all swapping
        arr[j] = temp;
    }

    private static int removeDups(int[] arr, int length) {   //first i sorted them now i am swapping them

        int i = 0;
        for (int j = 1; j < length; j++) {
            if (arr[i] != arr[j]) {
                i++; //incriment i
                //set arr[i]=arr[j]
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

}
