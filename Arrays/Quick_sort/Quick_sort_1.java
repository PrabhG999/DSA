package Arrays.Quick_sort;

public class Quick_sort_1 {
    public static void quickSort(int []arr,int low,int high){
        if(low<high){
            int pi = position(arr,low,high);

            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);  //calls recursively
        }
    }

    private static int position(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i =low-1;
        for(int j =low;j<high;j++){        //working with pivot and swapping
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp =arr[i+1];
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
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Original Array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
