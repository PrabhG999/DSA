package Arrays.Quick_sort;

public class Quick_sort_2 {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = position(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int position(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;

    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)            //suppliment method
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int[] arr = {21, 34, 15, 89, 56, 78, 17, 45, 99, 11};
        System.out.println("Original Array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
