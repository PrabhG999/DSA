package Arrays.Merge_Sort;

import java.util.Arrays;

public class Merge_sort_1 {
    private static int remove_dupes(int[] array) {
        int i=0;
        int j;

        int size = array.length-1;
        for(j=1;j<size;j++){
            if(array[j]!=array[i]){
                i++;
                array[i]=array[j];
            }
        }
        return i+1;
    }
    private static void merge_sort(int[] array,int left,int right) {
        if (left<right){
            int mid = left + (right - left) / 2;

            merge_sort(array,left,mid);
            merge_sort(array,mid+1,right);
            merge(array,left,right,mid);

        }
    }

    private static void merge(int[] array, int left, int right, int mid) {
        int l1 = mid-left+1;
        int r1 = right-mid;
        int lArr [] =new int[l1];
        int rArr[]= new int [r1];

        for(int x =0;x<l1;x++){
            lArr[x] = array[left+x];
        }
        for(int x=0;x<r1;x++){
            rArr[x] = array[mid+1+x];
        }
        int i=0;
        int j=0;
        int k =left;
        while(i<l1 && j<r1){
            if(lArr[i]<=rArr[j]){
                array[k]=lArr[i];
                i++;
            }else{
                array[k]=rArr[j];
                j++;
            }
            k++;
        }
        while(i<l1){
            array[k]=lArr[i];
            i++;
            k++;
        }
        while(j<r1){
            array[k]=rArr[j];
            j++;
            k++;
        }

    }

    public static void main(String []args){
        int[] array = {33, 18, 33, 5, 22, 18, 22, 30, 5, 11, 11, 27, 16, 2, 2, 2, 9, 14, 27, 35, 35, 17, 8, 8, 19};

        int size = array.length;
        System.out.println("Old size of the array"+ size);
        System.out.println("Before removing duplicates"+ Arrays.toString(array));
        merge_sort(array,0, size-1); //will use Merge Sort
        System.out.println("Post solving the array "+ Arrays.toString(array));

        int newSize = remove_dupes(array); // Remove duplicates from the sorted array
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(array, newSize)));
        System.out.println("New size of the array: " + newSize);
    }
}
