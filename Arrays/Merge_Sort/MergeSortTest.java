package Arrays.Merge_Sort;

public class MergeSortTest {
    public static void main(String[] args) {
        int[] array1 = {12, 11, 13, 5, 6, 7};
        int[] array2 = {4, 1, 3, 9, 7};

        System.out.println("Original Array 1: ");
        printArray(array1);

        divide(array1, 0, array1.length - 1);

        System.out.println("Sorted Array 1: ");
        printArray(array1);

        System.out.println("\nOriginal Array 2: ");
        printArray(array2);

        divide(array2, 0, array2.length - 1);

        System.out.println("Sorted Array 2: ");
        printArray(array2);
    }

    private static void divide(int[] arr, int si, int ei) {
        if (si < ei) {
            int mid = si + (ei - si) / 2;

            divide(arr, si, mid);
            divide(arr, mid + 1, ei);
            conquer(arr, si, mid, ei);
        }
    }

    private static void conquer(int[] arr, int si, int mid, int ei) {
        // new array to save the values
        int merged[] = new int[ei - si + 1];
        int indx1 = si;
        int indx2 = mid + 1;
        int x = 0; //to track ndex of merged arr

        while (indx1 <= mid && indx2 <= ei) {

            if (arr[indx1] <= arr[indx2]) {
                merged[x++] = arr[indx1++];
            } else {
                merged[x++] = arr[indx2++];
            }
        }
        while(indx1<=mid){
            merged[x++] = arr[indx1++];
        }
        while(indx2<=ei){
            merged[x++]=arr[indx2++];
        }
        for(int i=0, j=si; i< merged.length;i++,j++){

            arr[j]=merged[i];
        }
    }


    private static void printArray(int[] arr) {
      for(int value:arr){
          System.out.println(value + "");
      }
        System.out.println();
    }

}
